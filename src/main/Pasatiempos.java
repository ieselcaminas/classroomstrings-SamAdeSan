public class Pasatiempos {
    public static String crearPasatiempo(String original){
        String pasatiempo = "";
        for(int i = 0; i < original.length(); i++){
            if ((original.charAt(i) == 'a')
                    || (original.charAt(i) == 'e')
                    || (original.charAt(i) == 'i')
                    || (original.charAt(i) == 'o')
                    || (original.charAt(i) == 'u')){
                pasatiempo += ".";
            }else{
                pasatiempo += original.charAt(i);
            }
        }
        return pasatiempo;
    }
    public static void main(String[] args) {
        String res = "";
        System.out.println(crearPasatiempo(res));
        String cadena = "hola esto es un pasatiempo";
        System.out.println(cadena);
        System.out.println(crearPasatiempo(cadena));
    }
}
