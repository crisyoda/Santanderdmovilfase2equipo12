package E1

import java.util.*
//Este archivo fue creado a partir del código en JAVA, la funcionalidad consiste en el
//ordenamiento de canciones de manera aleatoria
class CancionesRandom {
    private fun SongsAleatorios() {
        val random = Random()
        val nombres = arrayOf(
            "1- Half Full Glass of Wine",
            "2- Solitude Is Bliss",
            "3- Lucidity",
            "4- Expectation",
            "5- Elephant",
            "6- Feels Like We Only Go Backwards"
        )
        val SongsAleatorios = arrayOfNulls<String>(5)
        var indice = 0
        while (indice < 5) {
            val posicion = random.nextInt(nombres.size)
            SongsAleatorios[indice] = nombres[posicion]
            indice++
        }
        println("Tu música se reproducirá en forma ALEATORIA: ")
        println(Arrays.toString(SongsAleatorios))
    }
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            CancionesRandom()
        }
    }
    init {
        SongsAleatorios()
    }
}