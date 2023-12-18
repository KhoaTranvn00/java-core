package oop.concept.encapsulate.accessModifier.package1;

public class ChildrenClass extends ParentClass {
    public static void main(String[] args) {
        ChildrenClass p = new ChildrenClass();

        System.out.println(p.public1);
        System.out.println(p.default1);
        System.out.println(p.protected1);
//        System.out.println(p.private1); // can't access
    }
}
