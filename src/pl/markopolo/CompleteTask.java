package pl.markopolo;

import java.util.Arrays;

public class CompleteTask {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int result = 0;
        int counter = 0;

        for (int i = 0; i < tasks.length; i++) {
            counter++;

            if (i == tasks.length - 1 || tasks[i] != tasks[i + 1]) {
                if (counter == 1) {
                    return -1;
                }

                result += counter / 3;
                if (counter % 3 != 0) result++;
                counter = 0;
            }
        }

        return result;
    }
}
