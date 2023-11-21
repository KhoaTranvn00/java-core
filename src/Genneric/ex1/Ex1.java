package Genneric.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static Genneric.ex1.Ex1.Generics.*;

public class Ex1 {
  public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5};

    intArray[0].toString();
    Integer.toString(intArray[0]);

    List<String> stringList
            = fromArrayToList(intArray, Object::toString);
    System.out.println(stringList.get(0).getClass());
    System.out.println(intArray[0].getClass());
  }

  static class Generics {
    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
      return Arrays.stream(a)
              .map(mapperFunction) //
//              .map(i -> Integer.toString(i))
              .collect(Collectors.toList());
    }

    public static Integer add1(Integer i) {
      return i+1;
    }

    public static String add2(Integer i) {
      return "i+1";
    }
  }
}


