package pl.markopolo;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1.length == 0) return nums1;
        Map<Integer, Integer> lookup = new HashMap<>();
        lookup.put(nums2[nums2.length - 1], -1);
        for(int i = nums2.length - 2; i >= 0; --i) {
            if(nums2[i] < nums2[i + 1]) lookup.put(nums2[i], nums2[i + 1]);
            else {
                int answers = lookup.get(nums2[i + 1]);
                while(nums2[i] > answers && answers != -1) {
                    answers = lookup.get(answers);
                }
                lookup.put(nums2[i], answers);
            }
        }
        int[] solution = new int[nums1.length];
        int index = 0;
        for(int num : nums1) {
            solution[index++] = lookup.get(num);
        }
        return solution;
    }
}
