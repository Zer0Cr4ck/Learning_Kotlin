fun main(args: Array<String>) {

    menu()
    var opcion = readLine()
    //Usando when
    while(opcion != "3"){
        when(opcion){
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            else -> println("Favor Ingresar una opcion Válida")
        }
        opcion = readLine()
    }
        println("Opcion 3, Saliendo...")

}

fun makeRecipe(){
    val ingredientes:List<String> = listOf<String>("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

    println("Ingresando a Hacer una receta")
    println("Esta es la Lista de Ingredientes:")

    for ((indice, item) in ingredientes.withIndex()){
        println("${indice.plus(1)} $item" )
    }
}

fun viewRecipe(){
    println("Ver mis Recetas")
}

fun menu(){
    val menu :String = """
    :: Bienvenido a Recipe Maker ::
    Selecciona la opcion deseada.
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir
    """.trimIndent()
    println(menu)
}