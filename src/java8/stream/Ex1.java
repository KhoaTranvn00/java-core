package java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Product {
    Integer price;
    String name;

    public Product(Integer price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
            new Product(14, "orange"), new Product(13, "lemon"),
            new Product(23, "bread"), new Product(13, "sugar"));

        List<String> collectorCollection =
            productList.stream().map(Product::getName).toList();
        System.out.println("collectorCollection " + collectorCollection);

        Map<Integer, List<Product>> groupingBy = productList.stream()
            .collect(Collectors.groupingBy(product -> product.getPrice()));
        System.out.println("groupingBy " + groupingBy);


        Map<Boolean, List<Product>> mapPartioned = productList.stream()
            .collect(Collectors.partitioningBy(element -> element.getPrice() > 15));
        System.out.println("mapPartioned " + mapPartioned);
        Map<Boolean, List<Product>> mapPartioned2 = productList.stream()
            .collect(Collectors.groupingBy(element -> element.getPrice() > 15));
        System.out.println("mapPartioned " + mapPartioned2);

        String listToString = productList.stream().map(Product::getName)
            .collect(Collectors.joining(",890 ", "[[[", "99]"));

        System.out.println("listToString " + listToString);

        IntStream intStreamParallel = IntStream.range(1, 150);
        intStreamParallel.forEach(System.out::println);
    }
}


