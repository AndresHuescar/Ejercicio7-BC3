import java.util.*;

class FrecuenciaPalabra {

    public static void main(String[] args) {

        // Guardo un texto con varias palabras repetidas
        String texto = "hola casa hola perro casa hola";

        // Divido el texto en palabras usando el espacio como separador
        String[] palabras = texto.split(" ");

        // Creo un HashMap para guardar cada palabra y el número de veces que aparece
        HashMap<String, Integer> contador = new HashMap<>();

        // Recorro cada palabra del array
        for (String palabra : palabras) {

            // Si la palabra no está todavía en el mapa, la añado con valor 1
            if (!contador.containsKey(palabra)) {
                contador.put(palabra, 1);

            } else {
                // Si ya existe, aumento su contador en 1
                contador.put(palabra, contador.get(palabra) + 1);
            }
        }

        // Muestro el resultado final con cada palabra y su número de repeticiones
        System.out.println(contador);
    }
}
