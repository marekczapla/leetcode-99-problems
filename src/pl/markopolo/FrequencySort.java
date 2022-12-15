package pl.markopolo;

import java.util.*;

public class FrequencySort {
    public String frequencySort(String s) {

        if(s.length() <= 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String output = new String(chars);;
        Map<String, Integer> map = new HashMap<>();
        int slow = 0;
        int fast = 1;
        for (; fast < s.length(); fast++) {
            if (chars[fast] != chars[slow]) {
                int diff = fast - slow;
                sb.append(output.substring(slow, fast));
                slow = fast;
                map.put(sb.toString(), diff);
                sb = new StringBuilder("");
            }
        }

        int diff = fast - slow;
        sb = new StringBuilder("");
        while (slow < fast) {
            sb.append(chars[slow]);
            slow++;
        }
        map.put(sb.toString(), diff);

        map = sortByVal(map);

        sb = new StringBuilder("");
        for (String cs : map.keySet()) {
            sb.append(cs);
        }

        return sb.toString();
    }

    private Map<String, Integer> sortByVal(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2) {
                return m2.getValue().compareTo(m1.getValue());
            }
        });

        Map<String, Integer> newMp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            newMp.put(entry.getKey(), entry.getValue());
        }

        return newMp;
    }
}