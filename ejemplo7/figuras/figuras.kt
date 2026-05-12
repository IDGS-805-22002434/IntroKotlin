fun main() {
    var opcion: Int

    do {
        println("Calculadora de Áreas")
        println("1. Área del Cuadrado")
        println("2. Área del Rectángulo")
        println("3. Área del Triángulo")
        println("4. Área del Círculo")
        println("5. Salir")
        print("Elige una opción (1-5): ")
        
        opcion = readln().toInt()

        when (opcion) {
            1 -> areaCuadrado()
            2 -> areaRectangulo()
            3 -> areaTriangulo()
            4 -> areaCirculo()
            5 -> println("Saliendo del programa")
            else -> println("Opción no válida. Elige un número del 1 al 5.")
        }
        
    } while (opcion != 5) 
}

fun areaCuadrado() {
    print("Ingresa la medida de un lado: ")
    val lado = readln().toDouble()
    
    val area = lado * lado
    println("Resultado: El área del cuadrado es: $area")
}

fun areaRectangulo() {
    print("Ingresa la base: ")
    val base = readln().toDouble()
    print("Ingresa la altura: ")
    val altura = readln().toDouble()
    
    val area = base * altura
    println("Resultado: El área del rectángulo es: $area")
}

fun areaTriangulo() {
    print("Ingresa la base: ")
    val base = readln().toDouble()
    print("Ingresa la altura: ")
    val altura = readln().toDouble()
    
    val area = (base * altura) / 2
    println("Resultado: El área del triángulo es: $area")
}

fun areaCirculo() {
    print("Ingresa el radio del círculo: ")
    val radio = readln().toDouble()
    
    val area = 3.1416 * (radio * radio) 
    println("Resultado: El área del círculo es: $area")
}