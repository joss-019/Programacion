/* Escribe un programa que inicie un vector con números al azar de 1 a 100. Después
crearemos un módulo al que le pasemos un número y me devuelva cuantas veces
aparece ese número en el vector.*/
/*
fun main() {

        //  vector de 10 posiciones
        val numeros = IntArray(10)

        // vector con números aleatorios del 1 al 100
        for (i in numeros.indices) {
            numeros[i] = (1..100).random()
        }

        println("Números del vector:")
        println(numeros.contentToString())


        print("Introduce un número del 1 al 100: ")
        val numeroBuscado = readLine()!!.toInt()

        // llamamos al módulo que cuenta las apariciones
        val cantidad = contarNumero(numeros, numeroBuscado)


        println("El número $numeroBuscado aparece $cantidad veces en el vector.")
    }

    // modulo que cuenta cuántas veces aparece un número en el vector
    fun contarNumero(vector: IntArray, numero: Int): Int {

        var contador = 0

        for (i in vector.indices) {
            if (vector[i] == numero) {
                contador++
            }
        }

        return contador
    }

*/
/*
    fun main() {

        // Creamos un vector de 10 posiciones
        val numeros = IntArray(10)

        // Rellenamos el vector con números aleatorios del 1 al 100
        for (i in numeros.indices) {
            numeros[i] = (1..100).random()
        }

        // Mostramos el vector
        println("Números del vector:")
        println(numeros.contentToString())

        // Pedimos un número al usuario
        print("Introduce un número del 1 al 100: ")
        val numeroBuscado = readLine()!!.toInt()

        // Llamamos al módulo para buscar la primera aparición
        val posicion = buscarNumero(numeros, numeroBuscado)

        // Mostramos el resultado
        if (posicion != -1) {
            println("El número $numeroBuscado aparece por primera vez en la posición $posicion.")
        } else {
            println("El número $numeroBuscado no está en el vector.")
        }
    }

    // Módulo que busca la primera aparición de un número
    fun buscarNumero(vector: IntArray, numero: Int): Int {

        for (i in vector.indices) {

            if (vector[i] == numero) {
                return i
            }
        }

        return -1
    }
*/
/*
fun main(){
    val vector= IntArray(20)
    var usuario=""
    for (i in vector.indices){
        vector[i]= (1..10).random()

            println("vector:")
            println(vector.contentToString())

    val vector2= IntArray(3)
        for (i in vector2.indices){
            println("Introduce el numero de la posicion $i:")
            vector2[i]=readLine()!!.toInt()
        }

    }
}
*/
/*
Realiza un programa que inicie dos vectores
de 3 elementos y los sume en un tercero.
Ejemplo:

*/
/*
fun main () {
    sumaVectores()
    sumaVectoresEficiente()
}

fun sumaVectoresEficiente() {

    var vecUno = ArrayList<Int>()
    var vecDos = ArrayList<Int>()
    var resultado = ArrayList<Int>()

    for (i in 1..3) {
        vecUno.add((1..10).random())
        vecDos.add((1..10).random())
    }

    for (i in 0..2) {
        resultado.add(vecUno[i] + vecDos[i])
    }

    println("Vector 1: $vecUno")
    println("Vector 2: $vecDos")
    println("Resultado: $resultado")
}

fun sumaVectores() {

    var vecUno = ArrayList<Int>()
    var vecDos = ArrayList<Int>()
    var resultado = ArrayList<Int>()

    vecUno.add((1..10).random())
    vecUno.add((1..10).random())
    vecUno.add((1..10).random())

    vecDos.add((1..10).random())
    vecDos.add((1..10).random())
    vecDos.add((1..10).random())

    resultado.add(vecUno[0] + vecDos[0])
    resultado.add(vecUno[1] + vecDos[1])
    resultado.add(vecUno[2] + vecDos[2])

    println(vecUno)
    println(vecDos)
    println(resultado)

}
*/

/*
fun main () {
    var valor = ""
    var vec = ArrayList<Int>()
    var seCumple = false

    do {
        println("Introduce un valor:")
        valor = readln()

        var v = valor.toIntOrNull()

        if (v != null) {
            for (i in 1..10) {
                vec.add(v++)
            }
            seCumple = true
        }

    }while (!seCumple)

    println(vec)
}
*/
/*
fun main() {
    var vector = ArrayList<String>()
    var panelVacio = ArrayList<String>()
    var mosca = ""
    var ganar = false
    var posiciones = ""

    for (i in 1..10) {
        vector.add("-")
        panelVacio.add("-")
    }

    var posicionMosca = (0..9).random()
    vector[posicionMosca] = mosca

    do {
        println("Bienvenido a la mosca")
        println()
        println(panelVacio)
        println()
        println("Elija una de las posiciones (0 a 9)")
        posiciones = readln()

        var n = posiciones.toIntOrNull()

        if (n != null && n in 0..9) {
            if (vector[n] == "") {
                println("Encontraste la mosca")
                ganar = true
            } else {
                if ((n > 0 && vector[n - 1] == "") ||
                    (n < 9 && vector[n + 1] == "*")) {

                    println("Estuvo cerca, pero revolotea")

                    vector[posicionMosca] = "-"
                    posicionMosca = (0..9).random()
                    vector[posicionMosca] = mosca

                } else {
                    println("Fallaste")
                }
            }
        } else {
            println("Introduce una posición válida entre 0 y 9")
        }

    } while (!ganar)
}
*/
