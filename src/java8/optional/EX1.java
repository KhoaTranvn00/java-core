package java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EX1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
        List<Integer> numbers2 = numbers.stream().map(IntSum::add1).collect(Collectors.toList());
        // i -> i.add1()
        // IntSum.add1(i)

        System.out.println(numbers);
        System.out.println(numbers2);
    }

    public static int add1(int i) {return i++;}
}

class IntSum {
    public static int add1(int i) {return ++i;}
}
