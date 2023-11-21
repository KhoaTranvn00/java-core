package collection;

import java.util.*;

public class Collection {
  public static void main(String[] args) {
//    List<Integer> arrayList = new ArrayList<>();
//    arrayList.add(3);
//    arrayList.add(1);
//    arrayList.add(2);
//    arrayList.add(1);
//    arrayList.add(0);
//    System.out.println("Elements of ArrayList: " + arrayList);
//
//
//    Set<Integer> hashSet = new HashSet<>();
//    hashSet.add(3);
//    hashSet.add(1);
//    hashSet.add(2);
//    hashSet.add(1);
//    hashSet.add(0);
//    System.out.println("Elements of HashSet: " + hashSet);
//
//    Set<Integer> linkedHashSet = new LinkedHashSet<>();
//    linkedHashSet.add(3);
//    linkedHashSet.add(1);
//    linkedHashSet.add(2);
//    linkedHashSet.add(1);
//    linkedHashSet.add(0);
//    System.out.println("Elements of LinkedHashSet: " + linkedHashSet);

    Map<String, Integer> studentScores = new HashMap<>();
    studentScores.put("Alice", 95);
    studentScores.put("Bob", 80);
    studentScores.put("Charlie", 92);
    studentScores.put("Charlie", 90);
    for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
