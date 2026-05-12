fun main(){
    val claveCorrecta = "2235" 
    var intentosFallidos = 0
    
    while (intentosFallidos < 3) {
        print("Ingresa la clave de seguridad: ")
        val claveIngresada = readln()
        
        if (claveIngresada == claveCorrecta) {
            println("Acceso concedido.")
            break 
        } else 
            intentosFallidos++ 
            println("Error. Llevas $intentosFallidos de 3 intentos permitidos.")
    }
    
    if (intentosFallidos == 3) {
        println("ACCESO DENEGADO: Controlador PLC bloqueado por seguridad.")
    }
}