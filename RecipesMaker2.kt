import java.lang.NullPointerException

fun main(args: Array<String>) {


    menuP()
    var codigo= readLine()?.toInt()

    while (codigo != 3){

        when(codigo){

            1 -> makeReceta()
            2 -> viewReceta()
            else -> println("Ingrese un codigo del menu")

        }

        codigo= readLine()?.toInt()

    }


    }


fun makeReceta(){

    println("Aqui haras una receta con estos  ingredientes :")

    val ingredientes = arrayOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
    for (i in ingredientes.indices){
        println("${i.inc()} : " + ingredientes[i] )
    }

}

fun viewReceta(){

    println("Ver Recetas")

}


fun menuP(){

    val menu : String = """
        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
        
        
    """.trimIndent()

    println(menu)

}




