import kotlin.random.Random

fun main() {
    val filas = 4
    val columnas = 4

    // Matriz representada como ArrayList de ArrayList
    val tablero = ArrayList<ArrayList<Int>>()

    var numBarcos = 0

    // Rellenar la matriz aleatoriamente con 0 y 1
    for (i in 0 until filas) {
        val fila = ArrayList<Int>()
        for (j in 0 until columnas) {
            val valor = (0..1).random() // 0 o 1 aleatorio
            fila.add(valor)
            if (valor == 1) {
                numBarcos++
            }
        }
        tablero.add(fila)
    }

    println("Barcos colocados: $numBarcos")

    // Bucle hasta que se encuentren todos los barcos
    while (numBarcos > 0) {
        print("Introduzca X: ")
        val x = readLine()!!.trim().toInt()
        print("Introduzca Y: ")
        val y = readLine()!!.trim().toInt()

        // Validar que las coordenadas estén dentro del tablero
        if (x < 0 || x >= filas || y < 0 || y >= columnas) {
            println("Coordenadas fuera del tablero.")
            continue
        }

        val valor = tablero[x][y]

        when (valor) {
            1 -> {
                numBarcos--
                println("ENCONTRADO 1 BARCO. QUEDAN $numBarcos barcos")
                tablero[x][y] = -1 // para no repetir
            }
            -1 -> println("Ya habías encontrado un barco en esa posición.")
            else -> println("AGUA. Aquí no hay barco.")
        }
    }

    println("¡Enhorabuena! Has encontrado todos los barcos.")
}
}