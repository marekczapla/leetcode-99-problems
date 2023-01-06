package pl.markopolo;

import java.math.BigInteger;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        String result = "";

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j<nums.length; j++) {
                String s1 = Integer.toString(nums[i]);
                String s2 = Integer.toString(nums[j]);
                if(((s2 + s1).compareTo(s1 + s2)) > 0) {

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

            result += Integer.toString(nums[i]);
        }

        BigInteger resultValue = new BigInteger(result);
        BigInteger zero = BigInteger.valueOf(0);

        return resultValue.compareTo(zero) == 0 ? "0" : result;
    }
}