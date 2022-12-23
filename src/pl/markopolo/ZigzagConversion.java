package pl.markopolo;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < sbs.length; i++) sbs[i] = new StringBuilder();
        int index = 0;
        int direction = -1;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            sbs[index].append(c);
            if (index == 0 || index == numRows - 1) direction = 0 - direction;
            index += direction;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : sbs) res.append(sb);
        return res.toString();
    }
}
