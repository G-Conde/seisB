import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //programa que solicite al usuario que ingrese una cadena de texto y luego cuenta

        System.out.println("Ingrese un texto");
        String text = scanner.nextLine();

        Map<Character, Integer> frecuentlyCharacters = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (frecuentlyCharacters.containsKey(c)) {
                frecuentlyCharacters.put(c, frecuentlyCharacters.get(c) + 1);
            } else {
                frecuentlyCharacters.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : frecuentlyCharacters.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        /*
         Escriba un programa que genere una lista de números aleatorios, la ordene y
            luego elimine los duplicados. Utilice un HashSet para almacenar los números
            únicos y un ArrayList para la lista original.
        */

         // Generar una lista de números aleatorios
        List<Integer> randomNumbers = new ArrayList<>();
        Random rand = new Random();

        // Generar 20 números aleatorios entre 0 y 99
        for (int i = 0; i < 20; i++) {
            randomNumbers.add(rand.nextInt(100));
        }

        // Imprimir la lista original
        System.out.println("Lista original de números aleatorios:");
        System.out.println(randomNumbers);

        // Ordenar la lista
        Collections.sort(randomNumbers);

        // Imprimir la lista ordenada
        System.out.println("Lista ordenada de números aleatorios:");
        System.out.println(randomNumbers);

        // Eliminar duplicados usando un HashSet
        HashSet<Integer> uniqueNumbersSet = new HashSet<>(randomNumbers);

        // Convertir el HashSet de nuevo a una ArrayList
        List<Integer> uniqueNumbersList = new ArrayList<>(uniqueNumbersSet);

        // Ordenar la lista de números únicos (esto puede no ser necesario si la lista debe estar ordenada)
        Collections.sort(uniqueNumbersList);

        // Imprimir la lista de números únicos
        System.out.println("Lista de números únicos ordenados:");
        System.out.println(uniqueNumbersList);


         /*  Caracteristica de un HashSet: es que sus elementos son unicos, no permite duplicados
                                           no tienen un orden.
                                           basado en una tabla, permite inserccion, eliminar y busqueda rapida
                                           permite elementos nulos  */

    }
}
/*
1- String.toCharArray(): Este método convierte el String en un arreglo de caracteres (char[]),
lo que permite iterar sobre cada carácter.
2- Map.containsKey(key): Verifica si el Map contiene una clave específica.
3- Map.put(key, value): Inserta un par clave-valor en el Map. Si la clave ya existe, actualiza su valor.
4- Map.Entry: Una interfaz que representa un par clave-valor en el Map.
5- Map.entrySet(): Devuelve un conjunto (Set) de todos los pares clave-valor en el Map.
.*/

