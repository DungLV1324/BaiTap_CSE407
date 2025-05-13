package _15_2251172299_LuuVanDung_BaiTap3;

public class CircleFactory implements ShapeFactory {
    private double radius;

    public CircleFactory(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape createShape() {
        return new Circle(radius);
    }
}
