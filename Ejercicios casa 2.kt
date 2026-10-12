
import kotlin.random.Random

fun leerEntero(mensaje: String): Int {
    while (true) {
        print(mensaje)
        val numero = readLine()?.toIntOrNull()

        if (numero != null) {
            return numero
        }

        println("Error: debes introducir un numero entero.")
    }
}

fun leerDouble(mensaje: String): Double {
    while (true) {
        print(mensaje)
        val numero = readLine()?.toDoubleOrNull()

        if (numero != null && numero.isFinite()) {
            return numero
        }

        println("Error: introduce un numero valido.")
    }
}

fun leerTexto(mensaje: String): String {
    print(mensaje)
    return readLine() ?: ""
}

fun posicionValida(pos: Int, limite: Int): Boolean {
    return pos >= 0 && pos < limite
}

fun mostrarVector(vector: List<*>) {
    println(vector)
}

// EJERCICIO 1
fun ejercicio1() {
    val vector = mutableListOf<String>()
    var dato: String

    do {
        dato = leerTexto("Introduce un dato (-1 para terminar): ")

        if (dato != "-1") {
            vector.add(dato)
        }
    } while (dato != "-1")

    var opcion: Int

    do {
        println("\n--- EJERCICIO 1 ---")
        println("1. Listar vector")
        println("2. Mostrar una posicion")
        println("3. Convertir una posicion a Double")
        println("0. Salir")

        opcion = leerEntero("Opcion: ")

        when (opcion) {
            1 -> mostrarVector(vector)

            2 -> {
                if (vector.isEmpty()) {
                    println("El vector esta vacio.")
                } else {
                    val pos = leerEntero("Posicion (0 a ${vector.size - 1}): ")

                    if (posicionValida(pos, vector.size)) {
                        println(vector[pos])
                    } else {
                        println("Error: posicion fuera de rango.")
                    }
                }
            }

            3 -> {
                if (vector.isEmpty()) {
                    println("El vector esta vacio.")
                } else {
                    val pos = leerEntero("Posicion (0 a ${vector.size - 1}): ")

                    if (posicionValida(pos, vector.size)) {
                        val original = vector[pos]
                        val convertido = original.toDoubleOrNull()

                        if (convertido != null && convertido.isFinite()) {
                            println("Conversion correcta: $convertido")
                        } else {
                            println(
                                "No se puede convertir '$original' a Double: " +
                                        "no tiene un formato numerico valido."
                            )
                        }
                    } else {
                        println("Error: posicion fuera de rango.")
                    }
                }
            }

            0 -> println("Saliendo del ejercicio 1.")
            else -> println("Opcion incorrecta.")
        }
    } while (opcion != 0)
}

// EJERCICIO 2
fun ejercicio2() {
    val vector = doubleArrayOf(
        2.0, 5.0, 8.0, 3.0, 10.0,
        7.0, 4.0, 9.0, 6.0, 11.0
    )

    var opcion: Int

    do {
        println("\n--- EJERCICIO 2 ---")
        println("1. Listar vector")
        println("2. Mostrar posicion")
        println("3. Listar posiciones pares")
        println("4. Listar posiciones impares")
        println("5. Listar valores pares")
        println("6. Listar valores impares")
        println("0. Salir")

        opcion = leerEntero("Opcion: ")

        when (opcion) {
            1 -> println(vector.contentToString())

            2 -> {
                val pos = leerEntero("Posicion (0 a 9): ")

                if (posicionValida(pos, vector.size)) {
                    println("Valor: ${vector[pos]}")
                } else {
                    println("Error: posicion fuera de rango.")
                }
            }

            3 -> {
                for (i in vector.indices) {
                    if (i % 2 == 0) {
                        println("Posicion $i: ${vector[i]}")
                    }
                }
            }

            4 -> {
                for (i in vector.indices) {
                    if (i % 2 != 0) {
                        println("Posicion $i: ${vector[i]}")
                    }
                }
            }

            5 -> {
                for (valor in vector) {
                    if (valor % 2.0 == 0.0) {
                        println(valor)
                    }
                }
            }

            6 -> {
                for (valor in vector) {
                    if (valor % 2.0 != 0.0) {
                        println(valor)
                    }
                }
            }

            0 -> println("Saliendo del ejercicio 2.")
            else -> println("Opcion incorrecta.")
        }
    } while (opcion != 0)
}

// EJERCICIO 3
fun ejercicio3() {
    val matriz = arrayOf(
        arrayOf("Yo", "quiero", "aprender", "a"),
        arrayOf("programar", "con", "Kotlin", "hoy"),
        arrayOf("porque", "es", "muy", "interesante"),
        arrayOf("y", "quiero", "hacer", "programas")
    )

    var opcion: Int

    do {
        println("\n--- EJERCICIO 3 ---")
        println("1. Mostrar matriz")
        println("2. Mostrar una fila")
        println("3. Formar frase con cinco posiciones")
        println("4. Mostrar matriz al reves")
        println("0. Salir")

        opcion = leerEntero("Opcion: ")

        when (opcion) {
            1 -> {
                for (fila in matriz) {
                    println(fila.contentToString())
                }
            }

            2 -> {
                val f = leerEntero("Fila (0 a 3): ")

                if (posicionValida(f, matriz.size)) {
                    println(matriz[f].contentToString())
                } else {
                    println("Error: fila fuera de rango.")
                }
            }

            3 -> {
                val frase = mutableListOf<String>()
                var correctas = true

                for (i in 1..5) {
                    val f = leerEntero("Fila de la posicion $i (0 a 3): ")
                    val c = leerEntero("Columna de la posicion $i (0 a 3): ")

                    if (posicionValida(f, 4) &&
                        posicionValida(c, 4)
                    ) {
                        frase.add(matriz[f][c])
                    } else {
                        println("Error: posicion fuera de rango.")
                        correctas = false
                        break
                    }
                }

                if (correctas) {
                    println(frase.joinToString(" "))
                }
            }

            4 -> {
                for (f in matriz.lastIndex downTo 0) {
                    for (c in matriz[f].lastIndex downTo 0) {
                        print("${matriz[f][c]} ")
                    }
                    println()
                }
            }

            0 -> println("Saliendo del ejercicio 3.")
            else -> println("Opcion incorrecta.")
        }
    } while (opcion != 0)
}

// EJERCICIO 4
fun ejercicio4() {
    val tesorosEnterrados = Array(5) {
        Array(5) { Random.nextInt(0, 2) }
    }

    // Garantizamos que exista al menos un tesoro.
    if (tesorosEnterrados.all { fila -> fila.all { it == 0 } }) {
        tesorosEnterrados[0][0] = 1
    }

    var pendientes = tesorosEnterrados.sumOf { fila ->
        fila.count { it == 1 }
    }

    println("Busca los tesoros. Las posiciones van de 0 a 4.")

    while (pendientes > 0) {
        println("Tesoros pendientes: $pendientes")

        val x = leerEntero("Introduce X (fila): ")
        val y = leerEntero("Introduce Y (columna): ")

        if (!posicionValida(x, 5) || !posicionValida(y, 5)) {
            println("Error: las coordenadas deben estar entre 0 y 4.")
        } else {
            when (tesorosEnterrados[x][y]) {
                1 -> {
                    tesorosEnterrados[x][y] = -1
                    pendientes--
                    println("¡Tesoro encontrado!")
                }

                0 -> println("Aqui no hay ningun tesoro.")
                -1 -> println("Ese tesoro ya estaba desenterrado.")
            }
        }
    }

    println("¡Has encontrado todos los tesoros!")
}

// EJERCICIO 5
fun ejercicio5() {
    val matriz = arrayOf(
        doubleArrayOf(2.0, 3.0, 4.0, 5.0),
        doubleArrayOf(6.0, 7.0, 8.0, 9.0),
        doubleArrayOf(10.0, 11.0, 12.0, 13.0),
        doubleArrayOf(14.0, 15.0, 16.0, 17.0)
    )

    var opcion: Int

    do {
        println("\n--- EJERCICIO 5 ---")
        println("1. Listar matriz")
        println("2. Poner una posicion a cero")
        println("3. Comprobar si un valor es par o impar")
        println("4. Realizar cambio")
        println("0. Salir")

        opcion = leerEntero("Opcion: ")

        when (opcion) {
            1 -> {
                for (fila in matriz) {
                    println(fila.contentToString())
                }
            }

            2, 3, 4 -> {
                val x = leerEntero("Fila (0 a 3): ")
                val y = leerEntero("Columna (0 a 3): ")

                if (!posicionValida(x, 4) ||
                    !posicionValida(y, 4)
                ) {
                    println("Error: posicion fuera de rango.")
                } else {
                    when (opcion) {
                        2 -> {
                            matriz[x][y] = 0.0
                            println("Posicion modificada.")
                        }

                        3 -> {
                            val valor = matriz[x][y]

                            if (valor % 1.0 != 0.0) {
                                println("$valor no es un entero: no es par ni impar.")
                            } else if (valor % 2.0 == 0.0) {
                                println("$valor es par.")
                            } else {
                                println("$valor es impar.")
                            }
                        }

                        4 -> {
                            val valor = matriz[x][y]

                            if (valor % 1.0 != 0.0) {
                                println("El valor no es entero; no se realiza el cambio.")
                            } else if (valor % 2.0 == 0.0) {
                                matriz[x][y] += 3.0
                                println("Era par. Nuevo valor: ${matriz[x][y]}")
                            } else {
                                matriz[x][y] += 1.0
                                println("Era impar. Nuevo valor: ${matriz[x][y]}")
                            }
                        }
                    }
                }
            }

            0 -> println("Saliendo del ejercicio 5.")
            else -> println("Opcion incorrecta.")
        }
    } while (opcion != 0)
}

// MENU PRINCIPAL
fun main() {
    var opcion: Int

    do {
        println("\n===== MENU PRINCIPAL =====")
        println("1. Ejercicio de vectores y conversion")
        println("2. Ejercicio de vector Double")
        println("3. Ejercicio de matriz de palabras")
        println("4. Ejercicio de tesoros")
        println("5. Ejercicio de matriz Double")
        println("0. Salir del programa")

        opcion = leerEntero("Elige un ejercicio: ")

        when (opcion) {
            1 -> ejercicio1()
            2 -> ejercicio2()
            3 -> ejercicio3()
            4 -> ejercicio4()
            5 -> ejercicio5()
            0 -> println("Programa finalizado.")
            else -> println("Opcion incorrecta.")
        }
    } while (opcion != 0)
}