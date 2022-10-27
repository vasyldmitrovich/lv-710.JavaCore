package hv13classes;

public class Cipher {
    String s = "JAVA CORE";
    int n = 4;

    public static String encrypt(String s, int n){

            String code = "";
            int len = s.length();
            for(int x = 0; x < len; x++){
                char c = (char)(s.charAt(x) + n);
                if (c > 'z')
                    code += (char)(s.charAt(x) - (26-n));
                else
                    code += (char)(s.charAt(x) + n);
            }
            return code;

        }
    public static String decrypt(String s, int n){

        String decode = "";
        int len = s.length();
        for(int x = 0; x < len; x++){
            char c = (char)(s.charAt(x) + n);
            if (c > 'z')
                decode += (char)(s.charAt(x) - (26-n));
            else
                decode += (char)(s.charAt(x) - n);
        }
        return decode;

    }


}
