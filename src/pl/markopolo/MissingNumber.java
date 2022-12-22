package pl.markopolo;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == mid) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }
}