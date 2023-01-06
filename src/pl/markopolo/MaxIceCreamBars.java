package pl.markopolo;

import java.util.Arrays;

public class MaxIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);
        int counter = 0;

        while (counter < costs.length && costs[counter] <= coins) {
            coins -= costs[counter];
            counter++;
        }

        return counter;
    }
}
