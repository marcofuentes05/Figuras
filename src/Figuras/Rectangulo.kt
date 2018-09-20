package Figuras

import Comportamientos.Describible
import Comportamientos.Dibujable

class Rectangulo: Dibujable, Describible {
    override var alto =0
    var ancho: Int = 0

    override fun pedirDatos() {
        println("Ingrese el alto del rectángulo: ")
        alto = readLine()!!.toInt()

        println("Ingrese el ancho del rectángulo: ")
        ancho = readLine()!!.toInt()
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