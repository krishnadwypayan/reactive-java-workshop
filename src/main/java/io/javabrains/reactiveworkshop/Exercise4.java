package io.javabrains.reactiveworkshop;

public class Exercise4 {

    public static void main(String[] args) {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono()
                .subscribe(number -> System.out.println(number),
                        err -> System.out.println(err.getMessage()),
                        () -> System.out.println("Completed"));

        // Get the value from the Mono into an integer variable
        final Integer integer = ReactiveSources.intNumberMono().block();


//        System.out.println("Press a key to end");
//        System.in.read();
    }

}
