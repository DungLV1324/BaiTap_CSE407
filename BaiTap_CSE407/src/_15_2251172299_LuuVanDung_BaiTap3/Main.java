package _15_2251172299_LuuVanDung_BaiTap3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory recleFactory = new RectangleFactory(12, 11);
        ShapeFactory cirFactory = new CircleFactory(10);

        Shape rectangle = recleFactory.createShape();
        Shape circle = cirFactory.createShape();

        Shape[] sp = {circle, rectangle};

        double sum = AreaCalculator.calculateTotalArea(sp);
        System.out.println("Tổng diện tích = " + sum);
    }
}