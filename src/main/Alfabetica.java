import java.util.Scanner;
/** * 8. Alfabética {@code Alfabetica.java} (M)
 * <p>Una palabra es alfabética si todas sus letras están ordenadas alfabéticamente. Por ejemplo, “amor”, “chino” e “himno” son palabras alfabéticas. Diseña un programa que nos diga si una palabra es alfabética o no.</p>*/
public class Alfabetica {
    // cáculo alfabética (si es o no es utilizamos boolean)
    public static boolean alfabetica(String palabra){

        for (int i = 0; i < palabra.length() - 1; i++){
            if (palabra.charAt(i) > palabra.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String palabra = " ";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una palabra: ");
        sc.nextLine();
        // introducimos si es o no es.
        if (alfabetica(palabra)){
            System.out.println("La palabra es alfabética.");
        }else{
            System.out.println("La palabra no es alfabética.");
        }
        sc.close();
    }
}
