import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto");
        String text = scanner.nextLine();

        Map<Character,Integer> frecuentlyCharacters = new HashMap<>();

        for (char c : text.toCharArray()){
            if(frecuentlyCharacters.containsKey(c)){
                frecuentlyCharacters.put(c, frecuentlyCharacters.get(c));
                


            }
        }

    }
}

/*Cree un programa que solicite al usuario que ingrese una cadena de texto y
luego cuente el número de veces que cada carácter aparece en la cadena.
Utilice un HashMap para almacenar los resultados y muestre el mapa al
usuario al final.*/

