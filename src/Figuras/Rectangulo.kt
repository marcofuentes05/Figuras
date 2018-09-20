package Figuras

import Comportamientos.Describible
import Comportamientos.Dibujable

class Rectangulo: Dibujable, Describible {
    override var alto =0
    var ancho: Int = 0

    override fun pedirDatos() {
        println("Ingrese el alto del rectángulo: ")
        try{
            alto = readLine()!!.toInt()}
        catch(e: Exception){
            println("Ese no es un dato valido, por eso, el valor por defecto es 5")
            alto = 5
        }

        println("Ingrese el ancho del rectángulo: ")
        try{
        ancho = readLine()!!.toInt()}
        catch(e: Exception){
            println("Ese no es un dato valido, por eso, el valor por defecto es 5")
            ancho = 5
        }
    }

    override fun dibujar(): String{
        var a : String = ""
        for (i in 1..alto){
            for (j in 1..ancho){
                a = a + "* "
            }
            a = a + "\n"
        }

        return a
    }
}