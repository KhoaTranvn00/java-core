package java8.optional;

import java.util.Optional;

public class Ex2 {
    public static void main(String[] args) {
        Optional<String> strOp = Optional.ofNullable("str");

        Integer i = strOp.map(e -> 3).get();
        System.out.println(i);
        System.out.println(i.getClass());
    }
}
