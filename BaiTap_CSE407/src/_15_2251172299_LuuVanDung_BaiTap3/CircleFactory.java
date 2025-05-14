package _15_2251172299_LuuVanDung_BaiTap3;

public class CircleFactory extends ShapeFactory {
    private double radius;

    public CircleFactory(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape createShape() {
        return new Circle(radius);
    }

    @Override
    public double calculateTotalArea() {
        return createShape().calculateArea();
    }
}
