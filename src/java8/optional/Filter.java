package java8.optional;

import java.util.Optional;

public class Filter {
    public static void main(String[] args) {
        Integer year = 2016;
        Optional<Integer> yearOptional = Optional.of(year);
        Integer is2016 = yearOptional.filter(y -> y == 2017).get();
        System.out.println(is2016);
//        boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
//        boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
    }
}
