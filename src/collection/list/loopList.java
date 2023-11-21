package collection.list;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class loopList {
    public static void main(String[] args) {
        List<Integer> list = getListIntegerInRange(0, 10);
        long startTime = System.nanoTime();
        long sum = 0;

//        1. traditional loop -> lower performance (each loop we need to get size and check condition)
        System.out.println(list.size());
        for (int i=0; i<list.size();i++) {
            System.out.println(list.get(i));
            if (i==5) {
                list.remove(i+1);
            }
        }
        System.out.println(list.size());

//        2. enhance loop

//        for (int i : list) {
//            System.out.println(i);
//        }

//        3. use iterator
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        4.1 forEach Java 8
//        list.forEach(System.out::println);



//        System.out.println(sum);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("%,d", totalTime);

    }

    public static List<Integer> getListIntegerInRange(int start, int end) {
        return IntStream.range(start, end)
            .boxed()
            .collect(Collectors.toList());
    }
}
