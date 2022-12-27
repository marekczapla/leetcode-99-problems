package pl.markopolo;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxJump = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxJump < i)
                return false;
            maxJump = (i + nums[i]) > maxJump ? i + nums[i] : maxJump;
        }
        return true;
    }
}
