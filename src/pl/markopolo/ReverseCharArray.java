package pl.markopolo;

public class ReverseCharArray {
    public void reverseCharArray(char[] chars) {
        int start = 0;
        int end = chars.length - 1;
        while(start <= end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
