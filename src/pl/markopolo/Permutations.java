package pl.markopolo;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] numbers) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), numbers);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] numbers){
        if(tempList.size() == numbers.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < numbers.length; i++){
                if(tempList.contains(numbers[i])) continue;
                tempList.add(numbers[i]);
                backtrack(list, tempList, numbers);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
