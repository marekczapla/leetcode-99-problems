package pl.markopolo;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
    public int [] intersect(int [] nums1, int [] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            int number = map.getOrDefault(i, 0);
            map.put(i, number + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(map.get(i) != null && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] solution = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            solution[i] = list.get(i);
        }
        return solution;
    }
}
