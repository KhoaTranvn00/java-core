package Ex;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
  protected List<Student> list;
  public Ex1() {
    list = new ArrayList<>();
  }
  public void createobject() {
    for(int i = 1; i< 1000000; i++) {
      Student obj1 = new Student ("ab");
      list.add(obj1);
      Student obj2 = new Student ("ab2");
      list.add (obj2);
      obj1 = null;
      obj2 = null;
    }
  }
  public void createlist() {
    for(int i = 1; i< 100000; i++) {
      Student obj1 = new Student ("ab3");
      Student obj2 = new Student ("ab4");
      List<Student> ls = new ArrayList<>();
      ls. add (obj1);
      System.out.println(ls.get(0));
      ls. add (obj2);
      list = ls;
      obj1 = null;
      obj2 = null;
      ls = null;
    }
  }
  public static void main(String[] args) {
    Ex1 ref = new Ex1();
    ref.createobject();
    System.out.println(ref.list);
    ref.createlist();
    System.out.println(ref.list);
  }
}
class Student {
  String name;
  
  Student (String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
