import java.util.Scanner;
/**
 * 2. Palabras de longitud dada II {@code Longitud2.java} (F)
 * <p>
 *     Realiza un programa que lea una cadena de texto y nos diga si alguna palabra tiene una longitud de {@code k} caracteres.
 * </p>
 * */
public class Longitud2 {
    public static void main(String[] args) {
        String cadena;
        String[] palabras;
        int k;
        int contador = 0;
        boolean palabra_longitudK = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena: ");
        cadena = sc.nextLine();
        System.out.println("Ingrese la posicion: ");
        k = sc.nextInt();
        sc.close();
        palabras = cadena.split(" ");
        for (String palabra : palabras) {
            if (palabra.length() == k) {
                palabra_longitudK = true;
                break;
            }
        }
        if (palabra_longitudK) {
            System.out.println("Existe al menos una palabra con longitud " + k + ".");
        }else{
            System.out.println("No existe una palabra con longitud " + k + ".");
        }
    }
}
