package org.example.consumer;

import org.example.util.SortingUtils;

import java.util.List;
import java.util.logging.Logger;

public class SortingUtilConsumer {

    private static final Logger logger = Logger.getLogger(SortingUtilConsumer.class.getName());

    public static void main(String[] args) {

        SortingUtils util = new SortingUtils();
        List<String> sorted = util.sort(List.of("Akshath", "Viny", "Sushmith", "Cherry"));

        logger.info(sorted.toString());
    }

}
