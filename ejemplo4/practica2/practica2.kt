fun main(){
    var carga = 0
    var minuto = 0
    
    while (carga < 100) {
        carga += 15 
        minuto++    
        println("Minuto $minuto: La batería está al $carga%")
    }
    
    println("Proceso detenido. Carga finalizada al $carga%")
}