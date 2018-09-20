import Comportamientos.Describible
import Comportamientos.Dibujable
import Figuras.Cuadrado
import Figuras.Rectangulo
import Figuras.Triangulo
fun main (args : Array <String>){

    // Se definen los strings que se imprimirán
    var menu : String = """
        Menu Principal
        ---------------
        1. Dibujar Figura
        2. Salir
    """.trimIndent()

    var menuF : String = """
        Menu de Figuras
        ---------------
        1. Dibujar un Cuadrado
        2. Dibujar un Rectángulo
        3. Dibujar un Triángulo
        4. Regresar al menu principal
    """.trimIndent()

    // Estas variables funcionan de control para los ciclos
    var seguir : Boolean = true
    var respuesta : String

    while (seguir){
        println(menu)
        respuesta = readLine()!!.toString()
        var seguir1 : Boolean = true
        //Si el usuario desea dibujar una figura,se imprime el siguiente menu, hasta que decida salir
        if (respuesta == "1"){
            while (seguir1){
                //Se imprime el segundo menu y se solicita una respuesta
                println(menuF)
                respuesta = readLine()!!.toString()
                //Se evalua su respuesta y para cada caso se instancia un objeto, y se le aplica el metodo pedirDatos y dibujarFigura de
                // las respectivas interfaces
                when (respuesta){
                    "1" ->{
                        var cuadrado = Cuadrado()
                        pedirDatos(cuadrado)
                        println(dibujarFigura(cuadrado))

                    }
                    "2"->{
                        var rectangulo = Rectangulo()
                        pedirDatos(rectangulo)
                        println(dibujarFigura(rectangulo))
                    }
                    "3"->{
                        var triangulo = Triangulo()
                        pedirDatos(triangulo)
                        println(dibujarFigura(triangulo))
                    }
                    "4"->seguir1 =false
                }
            }

        }else{
            seguir = false
        }
    }
}

//Estas funciones unen los objetos a sus interfaces en la clase principal
fun dibujarFigura(dibujable: Dibujable): String{
    return dibujable.dibujar()
}
fun pedirDatos(describible: Describible){
    describible.pedirDatos()
}