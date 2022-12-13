package pl.markopolo;

public class ReplaceDigits {
    public String replaceDigits(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i = i+2) {
            sb.append(s.charAt(i));
            if((i+1) < s.length()) {
                int shift =  s.charAt(i+1)-'0';
                sb.append((char)(s.charAt(i)+shift));
            }
        }
        return sb.toString();
    }
}
