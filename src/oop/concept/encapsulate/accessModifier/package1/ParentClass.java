package oop.concept.encapsulate.accessModifier.package1;

public class ParentClass {
    public String public1;
    private String private1;
    protected String protected1;
    String default1;

    public ParentClass() {
        this.public1 = "public1 value";
        this.private1 = "private1 value";
        this.protected1 = "protected1 value";
        this.default1 = "default1 value";
    }

    public static void main(String[] args) {
        ParentClass p = new ParentClass();

        System.out.println(p.public1);
        System.out.println(p.default1);
        System.out.println(p.protected1);
        System.out.println(p.private1); // can't access
    }
}
