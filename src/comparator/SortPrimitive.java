package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPrimitive {
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>();
    a.add(3);
    a.add(4);
    a.add(2);
    a.add(1);
    System.out.println("Before sort " + a);
    Collections.sort(a);
    System.out.println("After sort " + a);

  }
}
