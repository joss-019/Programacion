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
