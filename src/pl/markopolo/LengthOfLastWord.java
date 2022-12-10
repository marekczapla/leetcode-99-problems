package pl.markopolo;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && len > 0) {
                return len;
            } else if (s.charAt(i) != ' ') {
                len++;
            }
        }
        return len;
    }
}
