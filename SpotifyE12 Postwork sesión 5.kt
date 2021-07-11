package Session5
fun main() {

//Código que muestra la "FUNCIÓN LAMBDA" con la funcionalidad de "AGREGAR CANCION A FAVORITOS"

 println ("tecla '1' para agregar la cancion a tus favoritos")
    val addFav =(readLine()?.toInt() as Int)  //Se utiliza para capturar el comando
// La función obtiene un entero (comando) y regresa un string con las indicaciones
    val favoritas: (Int) -> String ={

    when {
    addFav == 1 -> "Se agregó a tu lita de FAVORITAS"
    else -> "No se agregará a tus favoritas"
}
}
println(favoritas(1)) //Se mostrará el mensaje de que la canción se AGREGÓ a la lista de favoritas

// Código que muestra una "FUNCION ANÓNIMA" con la funcionalidad de "QUITAR CANCION DE LOS FAVORITOS"

    println ("tecla '2' para QUITAR la cancion de tus favoritos")
  val delFav = (readLine()?.toInt() as Int)  //Se utiliza para capturar el comando
    val quitar = fun(delFav:Int): String {
        return when {
            delFav == 2 ->"se quitará de tu lista :("
            else -> "no se quitará de tu lista :)"
        }
    }
    println(quitar(2)) //Se mostrará el mensaje de que la canción se QUITÓ de la lista

// RETO FINAL/POSTWORK: Código que utiliza métodos de estructura de datos
// En este caso, se tiene la funcionalidad de ordenar las canciones de manera DESCENDENTE o ALEATORIA

        fun resInvalido(){ println("Opción no válida,se reproducirá tu lista de manera normal")}
        val songs = listOf(

            "1- Half Full Glass of Wine",
            "2- Solitude Is Bliss",
            "3- Lucidity",
            "4- Expectation",
            "5- Elephant",
            "6- Feels Like We Only Go Backwards"
        )
        println("""teclea una letra para orden de reproducción
             =>(a) para orden ALEATORIO 
             =>(d) para orden DESCENDENTE""")


                var idOpcion = readLine()?. toString()   //Se utiliza para capturar el comando
                val desSon = songs.asReversed()  //Ordenará de manera DESCENDENTE
                val aleatorio = songs.shuffled()  //Ordenará de manera ALEATORIA

                when (idOpcion){

                    "a" -> println ("""Tu música se reproducirá en forma ALEATORIA: 
        $aleatorio""".trimMargin())
                    "d" -> println("""Tu música se reproducirá en orden DESCENDENTE: 
        $desSon""")
                    "A" -> println ("""Tu música se reproducirá en forma ALEATORIA: 
        $aleatorio""".trimMargin())
                    "D" -> println("""Tu música se reproducirá en orden DESCENDENTE: 
        $desSon""".trimMargin())
                   else -> {
                       resInvalido() // En caso de poner un dato incorrecto, se mandará llamar la función que muestra
                                     // el mensaje de que la opción no es válida
                   }
                }
}



