package Figuras

import Comportamientos.Describible
import Comportamientos.Dibujable

open class Cuadrado: Dibujable, Describible {
    override var alto =0
    constructor(){
        alto = 0
    }

    override fun pedirDatos() {
        println("Ingrese el alto del cuadrado")
        alto = readLine()!!.toInt()
    }

    override fun dibujar(): String{
        var a : String = ""
        for (i in 1..alto){
            for (b in 1..alto){
                a = a + "* "
            }
            a = a + "\n"
        }
        return a
    }

}

