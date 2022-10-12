package org.example.util;

import org.example.sorting.algorithm.BubbleSort;

import java.util.List;

public class SortingUtils {

    public List<String> sort(List<String> names) {

        BubbleSort bubbleSort = new BubbleSort();
        return bubbleSort.sort(names);
    }

}
