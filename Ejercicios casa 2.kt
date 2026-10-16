


fun main() {
    val palabras = listOf("perro", "coche", "gato", "libro", "planta")
    val palabra = palabras.random()

    val letrasUsuario = MutableList(palabra.length) { '_' }
    var intentos = 5

    println("Adivina la palabra")
    println("La palabra tiene ${palabra.length} letras")

    while (intentos > 0 && letrasUsuario.contains('_')) {
        println("\nPalabra: ${letrasUsuario.joinToString(" ")}")
        println("Intentos restantes: $intentos")

        print("Introduce una letra: ")
        val letra = readln().lowercase()

        print("¿En qué posición va? (Empieza en 1): ")
        val posicion = readln().toIntOrNull()

        if (posicion != null &&
            posicion in 1..palabra.length &&
            letra.length == 1 &&
            palabra[posicion - 1].toString() == letra
        ) {
            letrasUsuario[posicion - 1] = letra[0]
            println("¡Correcto!")
        } else {
            intentos--
            println("Incorrecto. Pierdes un intento.")
        }
    }

    if (!letrasUsuario.contains('_')) {
        println("\n¡Has ganado! La palabra era $palabra")
    } else {
        println("\n¡Has perdido! La palabra era $palabra")
    }
} = 'l'
            palabra[3]
            palabra[5]
        }

    */
 //ahora tiene que recorrer toda la palabra//
/*
//corremos, cada posicion del numero hay que decir cual es que numero es y si es par o impar//

fun main(){

        println("")
    )



}


*/
/* generamos una palabra aleatoria, y vamos pidiendo x veces a user que intente acertar letras, indicando el numero de letras con .lenght,
y que el usuario pueda decir la letra que quiere, y meterlo en la posicion que quiere, si no lo adivina pierde. tiene 5 intentos
 */

fun main() {
    val palabras = listOf("DavidMerino", "AlejandroPeña", "DanielMolina")
    val palabra = palabras.random()
    val letraUsuario = MutableList(palabra.length) { '_' }
    var intentos= 5
    println("Adivina la palabra")
    println("La palabra tiene ${palabra.length} letras")
    while (intentos > 0 && letraUsuario.contains('_')) {
        println(letraUsuario.joinToString(" "))
        println("Introduce una letra: ")
        val letra= readln()
        for (i in palabras.indices) {}

    }



}


