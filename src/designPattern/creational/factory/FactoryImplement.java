package designPattern.creational.factory;

public class FactoryImplement {
    public static void main(String[] args) {
        // 4. Use factory
        Shape circle = ShapeFactoryImpl.create(SHAPE_TYPE.CIRCLE);
        circle.draw();
        Shape rectangle = ShapeFactoryImpl.create(SHAPE_TYPE.RECTANGLE);
        rectangle.draw();
    }
}

// 1. Create abstract product
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

// 3. Create factory
enum SHAPE_TYPE {
    CIRCLE,
    RECTANGLE;
}
class ShapeFactoryImpl {
    public static Shape create(SHAPE_TYPE type) {
        return switch (type) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            default -> throw new IllegalArgumentException("Type not support");
        };
    }
}
