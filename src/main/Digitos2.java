public class Digitos2 {
    public static boolean esNumero(String cadena) {
        int contador = 0;
        String[] palabras = cadena.split(" ");
        boolean esNumero;
        for (int i = 0; i < palabras.length; i++) {
            esNumero = esUnNumeroPalabra(cadena);
        }
        return contador == palabras.length;
    }
    public static boolean esUnNumeroPalabra(String cadena) {
        for (int j = 0; j < cadena.length(); j++) {
            if (!Character.isDigit(cadena.charAt(j))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(esNumero("hhbj123nn"));
    }
}