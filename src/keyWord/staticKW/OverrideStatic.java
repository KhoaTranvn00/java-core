package keyWord.staticKW;

public class OverrideStatic {
    public static void main(String[] args) {
//        A.run1();
    }
}

class A {
    void run1() {
        System.out.println("run 1");
    }
}

class B extends A {
    @Override
    void run1() {
        System.out.println("run 2");
    }
}
