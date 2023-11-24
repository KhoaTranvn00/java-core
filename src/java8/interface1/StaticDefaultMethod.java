package java8.interface1;

public class StaticDefaultMethod {
    public static void main(String[] args) {
        String a = Vehicle.staticMethod();
        System.out.println(a);
    }
}

interface Vehicle {
    default String defaultMethod() {
        return "Default method";
    }
    static String staticMethod() {      // static method can't override
        return "Static method";
    }
    String normalMethod();
}

class Car implements Vehicle {
//    @Override
//    public String staticMethod() {
//        return Vehicle.super.defaultMethod();
//    }

    @Override
    public String normalMethod() {
        return null;
    }
}