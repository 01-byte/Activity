package tasks;

public class Task15 {

    // 1. Shape interface
    interface Shape {
        double calculateArea();
        double calculatePerimeter();
    }

    // 2. Abstract class AbstractShape
    abstract static class AbstractShape implements Shape {
        protected String color;
        protected double length;
        protected double width;

        public AbstractShape(String color, double length, double width) {
            this.color = color;
            this.length = length;
            this.width = width;
        }
    }

    // 3a. Circle class
    static class Circle extends AbstractShape {
        private double radius;

        public Circle(String color, double radius) {
            super(color, radius, radius); // Assign radius to both length and width
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // 3b. Rectangle class
    static class Rectangle extends AbstractShape {
        public Rectangle(String color, double length, double width) {
            super(color, length, width);
        }

        @Override
        public double calculateArea() {
            return length * width;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    // 4. Main method
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Circle:");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
