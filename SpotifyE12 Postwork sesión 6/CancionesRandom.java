package E1;

import java.util.Arrays;
import java.util.Random;
//Este archivo inicialmente se creó en JAVA, la funcionalidad consiste en el
//ordenamiento de canciones de manera aleatoria, se copiará en Kotlin.
public class CancionesRandom {
    public CancionesRandom() {
        SongsAleatorios();
    }
    public static void main(String[] args) {
        new CancionesRandom();
    }
    private void SongsAleatorios() {
        Random random = new Random();
        String[] nombres = {"1- Half Full Glass of Wine",
                "2- Solitude Is Bliss",
                "3- Lucidity",
                "4- Expectation",
                "5- Elephant",
                "6- Feels Like We Only Go Backwards"};
        String[] SongsAleatorios = new String[5];
        int indice = 0;
        while (indice < 5) {
            int posicion = random.nextInt(nombres.length);
            SongsAleatorios[indice] = nombres[posicion];
            indice++;
        }
        System.out.println("Tu música se reproducirá en forma ALEATORIA: ");
        System.out.println(Arrays.toString(SongsAleatorios));
    }
}
