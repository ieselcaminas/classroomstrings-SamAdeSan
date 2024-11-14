import java.util.Scanner;
public class Invertida {
    public static String invertir(String original){
        String[] palabras = original.split(" ");
        String invertido = "";
        for (int i = palabras.length - 1; i >= 0; i--) {
            invertido += palabras[i];
            if (i > 0) {
                invertido += " "; // Agregar espacio entre palabras
            }
        }
        return invertido;
    }
    public static void main(String[] args) {
        String res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        res = scanner.nextLine();
        System.out.println(invertir(res));
    }
}
