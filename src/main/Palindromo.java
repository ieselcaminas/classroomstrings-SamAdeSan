public class Palindromo {
    public static boolean esPalindromo(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(esPalindromo("acdc"));
    }
}