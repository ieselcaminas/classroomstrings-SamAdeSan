public class Parentesis {
    public static boolean bienParentesis (String cadena) {
        int contador = 0;
        char caracter;
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (caracter == '(') {
                contador++;
            }else if (caracter == ')') {
                contador--;
                if (contador < 0) {
                    return true;
                }
            }
        }
        return contador == 0;
    }
    public static boolean siOnoParentizada (String cadena) {
        if (bienParentesis(cadena)) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(bienParentesis("Esto(es) )una cadena)(parentizada)"));
        String parentesis = "";
        if (siOnoParentizada(parentesis)) {
            System.out.println("Está bien parentizado.");
        }
        else {
            System.out.println("Está mal parentizado.");
        }

    }
}