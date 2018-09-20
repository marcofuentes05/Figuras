package Figuras

import Comportamientos.Describible
import Comportamientos.Dibujable

class Triangulo: Dibujable, Describible {
    override var alto = 0

    override fun pedirDatos() {
        println("Ingrese el alto del triángulo: ")
        try{
            alto = readLine()!!.toInt()}
        catch(e:Exception){
            println("Ese no es un dato valido, por eso, el valor por defecto es 5")
            alto = 5
        }
    }
    override fun dibujar(): String {
        var a : String = ""
        var c : Int = 1

        for (i in 1..alto){
            for(k in 1..(alto-c)){
                a = a + " "
            }
            for (j in 1..c){
                a = a + "* "
            }
            c = c + 1
            a = a + "\n"
        }
        return a
    }
}