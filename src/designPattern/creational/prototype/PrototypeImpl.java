package designPattern.creational.prototype;

public class PrototypeImpl {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("Red");
        circle.setRadius(12);
        circle.draw();

        Shape otherCircle = circle.clone();
        otherCircle.draw();
    }
}

abstract class Shape {
    protected String color;     // this property can not copy by normal way

    public Shape() {
    }
    public Shape(Shape x) {
        this.color = x.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public abstract Shape clone();
    public void draw() {
        System.out.println("draw with color: " + color);
    };
}

class Circle extends Shape {
    private int radius;       // this property can not copy by normal way

    public Circle() {
        super();
    }
    public Circle(Shape x, int radius) {
        super(x);
        this.radius = radius;
    }
    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw with radius: " + radius);
    }

}
