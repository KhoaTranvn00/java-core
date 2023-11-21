package dataType.primitive;

import java.util.ArrayList;
import java.util.List;

public class PassByValue {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        changeInteger(i);
        System.out.println(i);
        Student s = new Student("a");
        changeObject(s);
        System.out.println(s.name);
        justChangePropertyObject(s);
        System.out.println(s.name);
        List<String> al = new ArrayList<>();
        al.add("a");
        changeArrayList(al);
        System.out.println("Size of array list " + al.size());
    }

    public static void changeInteger(Integer i) {
        i++;
        System.out.println("Integer in scope change " + i);
    }

    public static void changeObject(Student s) {
        s = new Student("b");
    }

    public static void changeArrayList(List<String> al) {
        al = new ArrayList();
        al.add("b");
        al.add("b");
        al.add("b");
    }

    public static void justChangePropertyObject(Student s) {
        s.name = "c";
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}
