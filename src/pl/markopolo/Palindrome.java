package pl.markopolo;

public class Palindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        char charStart;
        char charEnd;
        while (start <= end) {
            charStart = s.charAt(start);
            charEnd = s.charAt(end);
            if (!Character.isLetter(charStart)) {
                start ++;
            } else if (!Character.isLetter(charEnd)) {
                end --;
            } else {
                if (Character.toLowerCase(charStart) != Character.toLowerCase(charEnd)) {
                    return false;
                }
                start ++;
                end --;
            }
        }
        return true;
    }
}
