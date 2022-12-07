package pl.markopolo;

public class MyAtoi {
    public int myAtoi(String s) {
        int sign = 1;
        int base = 0;
        int i = 0;
        if (s.isEmpty()) return 0;
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        if (i == s.length()) return 0;
        if (s.charAt(i) == '-' || s.charAt(i) == '+')
            sign = s.charAt(i++) == '-' ? -1 : 1;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10 * base + (s.charAt(i++) - '0');
        }
        return base * sign;
    }
}
