public class Longitud3 {
    public static boolean longitud(int k, String[] palabra) {
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() >= k) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String cadena = "22 333 4444 55555";
        int num = 4;
        String[] palabras = cadena.split(" ");
        if (longitud(num, palabras))
            System.out.println("Todas las cadenas de k (" + num + ") son cortas.");
        else
            System.out.println("Hay alguna cadena de k (" + num + ") que es larga.");
    }
}
