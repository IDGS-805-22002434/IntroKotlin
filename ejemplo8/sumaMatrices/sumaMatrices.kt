fun main() {
    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val resultado = Array(3) { IntArray(3) }

    println("\nIngresa los valores de la PRIMERA matriz:")
    for (fila in 0..2) {
        for (columna in 0..2) {
            print("Valor para matriz 1[$fila][$columna]: ")
            matriz1[fila][columna] = readln().toInt()
        }
    }

    println("\nIngresa los valores de la SEGUNDA matriz:")
    for (fila in 0..2) {
        for (columna in 0..2) {
            print("Valor para matriz 2[$fila][$columna]: ")
            matriz2[fila][columna] = readln().toInt()
        }
    }

    for (fila in 0..2) {
        for (columna in 0..2) {
            resultado[fila][columna] = matriz1[fila][columna] + matriz2[fila][columna]
        }
    }

    println("\nEl resultado de la suma es:")
    for (fila in 0..2) {
        for (columna in 0..2) {
            print("${resultado[fila][columna]}\t") 
        }
        println() 
    }
}