fun main(){
    var diametro: Double
    
    do {
        print("Ingresa el diámetro de la tubería (debe ser mayor a 0): ")
        diametro = readln().toDouble() 
        
        if (diametro <= 0) {
            println("Valor no permitido. Intenta de nuevo.")
        }
    } while (diametro <= 0) 
    
    println("Diámetro aceptado correctamente: $diametro")
}