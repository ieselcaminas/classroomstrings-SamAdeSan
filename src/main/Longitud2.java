import java.util.Scanner;
public class Longitud2 {
    public static boolean longitud(int k, String[] palabras) {

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == k) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String cadena;
        String[] palabras;
        int k;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cadena: ");
        cadena = sc.nextLine();
        System.out.println("Ingrese la posicion: ");
        k = sc.nextInt();

        sc.close();
        palabras = cadena.split(" ");

        if (longitud(k, palabras)) {
            System.out.println("Existe una palabra con longitud " + k + ".");
        }else{
            System.out.println("No existe una palabra con longitud " + k + ".");
        }
    }
}
