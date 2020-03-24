import java.lang.NullPointerException

const val N="NAME"

//Funciones puras






fun main(args: Array<String>) {
    println("Hola Mundo")
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)

    val a=4
    val b=2


    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))



    val name : String = args[0]// Tiempo de ejecucion
    println(name)

    println(N)

    //const tiemp ode compilacion


    val nombres ="joel"
    val apellidos : String ="Torres"

    println("Tu nombre es: $nombres $apellidos")

    //Raw String

    val parrafo="""
        ** lorem impsum is simply dummy
        ** text of the printing
        ** and type standar dummt trex ecver since
        ** the 1500s
        *when
    """.trimIndent()

    println(parrafo.trimMargin("** "
    ))


    val nombre="fiorella"
    val apellido ="Vasquez"

    val nombreapellido ="Fiorella\tVasquez"

    println("tu nombre es: $nombre $apellido")
    println("Tu nombre es : $nombreapellido")


    val onetoHundred = 1..5

    for (i in onetoHundred){

        println(i)


    }



    val aToC = 'A'..'C'

    for (letra in 'A'..'C'){
        println(letra)
    }


    //if operadores logicos

    val numero = 6
    if(numero.equals(2)){
        println("Son iguales")
    }else{
        println("no,no son iguales")
    }



    //WHEN ---> SWITCH--->case

    when(numero){
        in 1..5 -> println("Si,esta entre 1 y 5")
        in 1..3 -> println("Si, esta entre 1 y 3")
        !in 5..10 -> println("no, no eesta entre 5 y 10")
        else -> println("No esta en ninguno de los anteriores")
    }


    var i=1
    //while contadores

    while(i < 1){//true false
    println("mensaje: $i")
    i++

}

i=1
do{
    println("mensjae dowhile: $i")
    i++
}while(i<1)






    var daysOfWeek = listOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")


    for((index,day) in daysOfWeek.withIndex()){
        println("$index :$day")
}


    var nombrefiorella = listOf("Fiorella","Sthefany","Vasquez","Mesias")

    nombrefiorella.forEach{
        println(it)
    }



    // BREAK

    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) break
            println("j: $j")
        }




}


    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) continue
            println("j: $j")
        }
}

    println("------------------------------------------------")



    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) break
                println("k: $k")
            }
        }
}




// lo de arriba con label

    terminarTodoCiclo@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..3) {
                if (k.equals(1)) break@terminarTodoCiclo
                println("k: $k")
            }
        }
}


println("-------------------------------------------------------")



for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..3) {
                if (k.equals(1)) continue
                println("k: $k")
            }
        }
}




    /*try {
        var compute: String?
    compute=null
    var longitud: Int = compute!!.length
    }catch (e: NullPointerException){
        println("Ingresa un valor, no aceptamos nulos")
    }*/

    //llamadsa segura

    var compute: String? = null
    var longitud: Int? = compute?.length
    println("Longitud: $longitud")

    //operador elvis

    var teclado : String?= null
    val longitudTeclado: Int = teclado?.length ?: 0
    println("Longitud Teclado : $longitudTeclado")


    val listWithNulls: List <Int?> = listOf<Int?>(7,null,null,5)

    val listWithoutNulls: List<Int?> = listWithNulls.filterNotNull()
    println(listWithoutNulls)







}