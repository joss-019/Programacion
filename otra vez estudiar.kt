/*8º La calculadora. Diseña un algoritmo que pida dos números y un operador (una
operación aritmética básica: sumar, restar, multiplicar o dividir). Se debe mostrar el
resultado de dicha operación. Controla el posible error como la división por cero, en este caso se indicará que no se puede realizar. El ejercicio se debe repetir indefinidamente
hasta que el usuario decida terminar.*/
/*
fun main(){
    var numero=""
    var numero2=""
    var operacion=0
    var elXocas= false
    var opcion=""
    do {
        println("introduce los pinches numeros chamaco")
        numero= readln()
        numero2=readln()
        var aitor = numero.toIntOrNull()
        var juan= numero2.toIntOrNull()
        if (aitor!=null && juan!=null){
            elXocas=true
        }else{
            println("sepee que no escucho los steps, dejame jugar al wow forever")
        }

    }while(!elXocas)
    var numero1Nuevo= numero.toInt()
    var numero2Nuevo= numero.toInt()

    do{
        println("+ para sumar" +
                "- para restar")
        opcion= readln()
        when(opcion){
            "+"->{
                operacion=numero1Nuevo+numero2Nuevo
                println("el resultado es $operacion")
            }
            "-"->{
                operacion=numero1Nuevo-numero2Nuevo
                println("el resultado es $operacion")
            }else -> {
                println("tus muertos")
            }
        }
    }while(opcion=="+"&& opcion=="-")
}
*/
/*
//3º Calcula el factorial de un número entero.
// El factorial es el resultado de multiplicar
//ese número por todos los números menores que él.
// Ejemplo: 4! = 4*3*2*1 = 24.

fun main () {
    var num = ""
    var vec = ArrayList<Int>()
    var todoCorrecto = false

    do {
        println("Dime un numero")
        num = readln()
        var n = num.toIntOrNull()

        if (n != null) {
            todoCorrecto = true
        }else {
            println("Intentalo de nuevo mamahuevo")
        }
    }while (!todoCorrecto)

    var numeroCorregido = num.toInt()
    vec.add(numeroCorregido)

    for (i in numeroCorregido-1 downTo 1) {
        vec.add(i)
        numeroCorregido = numeroCorregido * i
    }

    println(vec)
    println("El factorial de $num es $numeroCorregido")

}
 */
