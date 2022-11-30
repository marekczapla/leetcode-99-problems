package pl.markopolo;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate (int [] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                return true;
            }
            hashSet.add(nums[i]);
        }
        return false;
    }
}
