package oop.concept.encapsulate.accessModifier.package2;

import oop.concept.encapsulate.accessModifier.package1.ParentClass;

public class NormalClass2 {
    public static void main(String[] args) {
        ParentClass p = new ParentClass();

        System.out.println(p.public1);
//        System.out.println(p.default1);
//        System.out.println(p.protected1);
//        System.out.println(p.private1);
    }
}
