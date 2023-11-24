package java8.other;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User(false));
        list.add(new User(false));
        list.add(new User(true));

        list.stream().forEach(Print::printObject);
//        System.out.println(r);
    }
}

class User {
    boolean isReal;

    public User(boolean isReal) {
        this.isReal = isReal;
    }

    public static void printUserStatic() {
        System.out.println("printUserStatic");
    }

    public boolean printUser() {
        System.out.println("printUser");
        return isReal;
    }
}

class Print {
    public static void printObject(Object o) {
        System.out.println(o);
    }
}
