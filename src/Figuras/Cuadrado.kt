package Figuras

import Comportamientos.Describible
import Comportamientos.Dibujable

open class Cuadrado: Dibujable, Describible {
    override var alto =0
    //El constructor no hace nada
    constructor(){
        alto = 0
    }

    //El metodo pedirDatos solo solicita los datos -_-
    override fun pedirDatos() {
        println("Ingrese el alto del cuadrado")
        try{
            alto = readLine()!!.toInt()
        }catch(e : Exception){
            println("Ese no es un dato valido, por eso, el valor por defecto es 5")
            alto = 5
        }

    }

    // El metodo dibujar dibuja cada figura segun sus propiedades, usando ciclos
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

