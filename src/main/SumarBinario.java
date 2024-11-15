public class SumarBinario {
    public static String sumaBinario(String num1, String num2) {
        String res = "";
        char b1;
        char b2;
        int bit1;
        int bit2;
        int suma;
        int acarreo = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            b2 = num2.charAt(i);
            b1 = num1.charAt(i);
            bit1 = Integer.parseInt("" + b1);
            bit2 = Integer.parseInt("" + b2);
            suma = bit1 + bit2 + acarreo;
            if (suma % 2 == 0) {
                res = "0" + res;
            }else {
                res = "1" + res;
            }
            if (suma == 0){
                acarreo = 0;
            }else if (suma == 1){
                acarreo = 0;
            }else if (suma == 2){
                acarreo = 1;
            }else{
                acarreo = 1;
            }
        }
        if (acarreo == 1){
            res = "1" + res;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(sumaBinario("1001", "0101"));
    }
}