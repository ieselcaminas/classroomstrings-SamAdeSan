/**
 * 4. Digitos {@code Digitos.java}
 * <p>
 *     Escribe un programa que muestre la cantidad de dígitos que aparecen en una cadena. Por ejemplo, la cadena “un 1 y un 20”, tiene 3 dígitos.
 * </p>
 */
public class Digitos {
    public static void main(String[] args) {
        String cadena = "040 99a 0 holas";
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
