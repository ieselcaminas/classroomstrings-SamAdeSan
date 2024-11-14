public class Digitos {
    public static boolean contarNumeros(String cadena) {
        int contador = 0;
        boolean esNumero = true;

        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                esNumero = false;
                break;
            }
        }
        return esNumero;
    }
    public static void main(String[] args) {
        String cadena = "040 99a 0 holas";
        int contador = 0;
        System.out.println(contarNumeros(cadena));
    }
}
