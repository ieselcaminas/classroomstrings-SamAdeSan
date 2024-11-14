import java.util.Scanner;
public class Longitud1 {
    public static void main(String[] args) {
        String cadena;
        int veces;
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la longitud de la cadena de texto: ");
        cadena = sc.nextLine();

        System.out.println("Introduzca la cantidad de palabras a contar.");
        veces = sc.nextInt();

        String[] palabras = cadena.split(" ");

        for (String palabra : palabras) {
            if (palabra.length() == veces) {
                contador++;
            }
        }

        System.out.println(contador);
    }
}
