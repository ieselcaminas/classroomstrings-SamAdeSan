import java.util.Scanner;
public class Siglas {
    public static String generarSiglas(String frase) {
        String siglas = "";
        for (String palabra : frase.split(" ")) {
// El signo "!" es el operador de negación lógica en Java.
// Cambia el valor de un booleano a su contrario.
// Básicamente estamos diciendo que si no es esa condición.
            if (!palabra.isEmpty() && Character.isUpperCase(palabra.charAt(0))) {
                siglas += palabra.charAt(0);
            }
        }
        return siglas;
    }
    public static void main(String[] args) {
        String frase;
        String siglas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();
        siglas = generarSiglas(frase);
        System.out.println("Las siglas de la frase son: " + siglas);
    }
}
