package org.example.consumer;

import org.example.sorting.algorithm.BubbleSort;

import java.util.List;
import java.util.logging.Logger;

public class DirectConsumer {

    private static final Logger logger = Logger.getLogger(DirectConsumer.class.getName());

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        List<String> sorted = bubbleSort.sort(List.of("Akshath", "Viny", "Sushmith", "Cherry"));

        logger.info(sorted.toString());
    }

}
