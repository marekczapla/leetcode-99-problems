package pl.markopolo;

import java.util.Arrays;

public class CountChars {
    public String countChars(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String output = "";
        int i;
        for (i = 0; i < s.length(); i++) {
            int counter = 1;
            while (i + 1 < s.length() && chars[i] == chars[i + 1]) {
                counter ++;
                i ++;
            }
            output += String.valueOf(counter) + chars[i];
        }
        return output;
    }
}
