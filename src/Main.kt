import kotlin.random.Random

fun main() {
    var cont : Int= 0
    var moneda : Int

    var puntosCara : Int =0
    var puntosSello : Int =0
    while (cont<20){
        moneda = Random.nextInt(1,3)
        if (moneda==1){
            puntosCara++
            cont++
            println("Cara Gano")
        }else if(moneda==2){
            puntosSello++
            cont++
            println("Sello gano")
        }
    }
    println("Puntos de cara: $puntosCara y Puntos de sellos: $puntosSello")
}