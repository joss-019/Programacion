
/*Calcula la raíz cuadrada de un número que pedimos por teclado, teniendo la
precaución de que el número no sea negativo; en este caso se debe informar de que la
operación no es posible (La raiz cuadrada se hace con sqrt(N)).
*/
/*
import kotlin.math.sqrt
fun main() {
    println("Introduce un número:")
    val numero = readln().toDouble()

    if (numero < 0) {
        println("La operación no es posible")
    } else {
        val raiz = sqrt(numero)
        println("La raíz cuadrada es: $raiz")
    }
}
*/
/*Determinar el número de cifras de un número de, como máximo, cinco cifras.
Ejemplos: 9560 debe indicar que tiene 4 cifras; -369 tiene 3 cifras. Pista: Un string es un
vector de char.*/
/*
fun main() {
    println("Introduce un número de máximo cinco cifras:")
      var numero= readln()
      var cifras= numero.length
//accede al primer carácter del texto. Las posiciones empiezan en 0.
// comprueba si ese primer carácter es el signo menos.//
    if (numero[0] == '-') {
        println("El número tiene ${cifras - 1} cifras")
    } else {
        println("El número tiene $cifras cifras")
    }
}
*/
 /*Calcula el factorial de un número entero. El factorial es el resultado de multiplicar
ese número por todos los números menores que él. Ejemplo: 4! = 4*3*2*1 = 24.*/
/*
fun main(){
    fun main() {
        println("Introduce un número entero:")
        var numero = readln().toInt()

        var factorial = 1

        for (i in 1..numero) {
            factorial = factorial * i
        }

        println("El factorial de $numero es $factorial")
    }
}
*/
/* Calcula la media para una cantidad indefinida de números. El programa parará de
pedir números cuando se le introduzca un número negativo, en ese momento nos dará
la media de los números introducidos hasta ese momento y la cantidad de los mismos
(sin incluir al negativo que usamos para acabar). */
/*
fun main() {
    var suma = 0.0
    var cantidad = 0

    println("Introduce un número (negativo para terminar):")
    var numero = readln().toDouble()

    while (numero >= 0) {
        suma = suma + numero
        cantidad = cantidad + 1

        println("Introduce otro número (negativo para terminar):")
        numero = readln().toDouble()
    }

    if (cantidad > 0) {
        val media = suma / cantidad
        println("La cantidad de números introducidos es: $cantidad")
        println("La media es: $media")
    } else {
        println("No se han introducido números para calcular la media")
    }
}
*/
/*
fun main(){
    var notasAlumnos=""
    var aprobados=0
    var suspensos=0
    var stop=false

    do {
        println("Introduce notas alumnos")
        notasAlumnos=readln()
        var notas= notasAlumnos.toDoubleOrNull()

        if (notas!=null){

        if(notas<0.0) {
            println("Adios")
            stop=true
        }
         if (notas<5.0) {
             println("hay $suspensos suspensos")
             suspensos++
         }
             if(notas>5.0){
                 aprobados++

             }
             if(notas==6.0){
                 println("Esto esta bien en verda, hay $aprobados aprobados y $suspensos suspensos")
              aprobados++}
            if (notas>6.0&&notas<9.0){
                println("notable, hay $aprobados aprobados y  $suspensos suspensos ")
                aprobados++
            }
            if (notas>=9.0){
                println("eres un, genio hay $aprobados aprobados y  $suspensos suspensos")
                aprobados++
            }
        }
    }while (!stop)}
*/