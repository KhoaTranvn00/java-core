package designPattern.creational.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // 4. Use abstract factory
        Shape circle = AbstractFactory.createShape(SHAPE_TYPE.CIRCLE);
        circle.draw();
        Color blue = AbstractFactory.createColor(COLOR_TYPE.BLUE);
        blue.fill();
    }
}
// 1. Crete abstract product
interface Shape {
    void draw();
}
// 2. Create concrete product
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw");
    }
}
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    }
}
interface Color {
    void fill();
}
class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill Red");
    }
}
class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Fill Blue");
    }
}

// 3. Create abstract factory
enum SHAPE_TYPE {
    CIRCLE,
    RECTANGLE
}
enum COLOR_TYPE {
    RED,
    BLUE
}
class AbstractFactory {
    public static Shape createShape(SHAPE_TYPE type) {
        return switch (type) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            default -> throw new IllegalArgumentException("Type not support");
        };
    };
    public static Color createColor(COLOR_TYPE type) {
        return switch (type) {
            case RED -> new Red();
            case BLUE -> new Blue();
            default -> throw new IllegalArgumentException("Type not support");
        };
    };
}