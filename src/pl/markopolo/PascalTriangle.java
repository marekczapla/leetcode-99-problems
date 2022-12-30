package pl.markopolo;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0) return list;

        List<Integer> innerList = new ArrayList<>();
        innerList.add(1);
        list.add(innerList);
        if(numRows == 1) return list;

        List<Integer> prevList = innerList;
        for(int i = 1; i < numRows; i++) {
            List<Integer> newList = new ArrayList<Integer>();
            newList.add(1);
            for(int j = 0; j < prevList.size() - 1; j++) {
                newList.add(prevList.get(j) + prevList.get(j + 1));
            }

            newList.add(1);
            list.add(newList);
            prevList = newList;
        }
        return list;
    }
}
