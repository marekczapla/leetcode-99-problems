package pl.markopolo;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> cycleNumbers = new HashSet<Integer>();
        int squareSum;
        int pop;
        while (cycleNumbers.add(n)) {
            squareSum = 0;
            while (n > 0) {
                pop = n % 10;
                squareSum += pop * pop;
                n /= 10;
            }
            if (squareSum == 1)
                return true;
            else
                n = squareSum;
        }
        return false;
    }
}