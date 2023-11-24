package java8.optional;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        Integer s = null;
        Optional<Integer> so = Optional.ofNullable(s);

        System.out.println(so.isEmpty());
    }
}
