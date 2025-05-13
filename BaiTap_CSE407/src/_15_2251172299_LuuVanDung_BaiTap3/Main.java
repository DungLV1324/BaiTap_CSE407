package _15_2251172299_LuuVanDung_BaiTap3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();

        Shape circle = circleFactory.createShape(scanner);
        Shape rectangle = rectangleFactory.createShape(scanner);

        Shape[] shapes = {circle, rectangle};

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.println("Tổng diện tích: " + totalArea);
    }
}