import Figuras.Cuadrado
import Figuras.Rectangulo
import Figuras.Triangulo
fun main (args : Array <String>){
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

    var seguir : Boolean = true
    var respuesta : String = ""
    while (seguir){
        println(menu)
        respuesta = readLine()!!.toString()
        var seguir1 : Boolean = true
        if (respuesta == "1"){
            while (seguir1){
                println(menuF)
                respuesta = readLine()!!.toString()
                when (respuesta){
                    "1" ->{
                        var cuadrado = Cuadrado()
                        cuadrado.pedirDatos()
                        println(cuadrado.dibujar())

                    }
                    "2"->{
                        var rectangulo = Rectangulo()
                        rectangulo.pedirDatos()
                        println(rectangulo.dibujar())
                    }
                    "3"->{
                        var triangulo = Triangulo()
                        triangulo.pedirDatos()
                        println(triangulo.dibujar())
                    }
                    "4"->seguir1 =false
                }
            }

        }else{
            seguir = false
        }
    }
}