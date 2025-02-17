package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        final List<Integer> integers = ReactiveSources.intNumbersFlux().toStream().toList();
        integers.forEach(System.out::println);

        /*
        Don't need the below lines as "toStream" is a blocking call.
        Process will not end unless the integers list is created.
         */

//        System.out.println("Press a key to end");
//        System.in.read();
    }

}
