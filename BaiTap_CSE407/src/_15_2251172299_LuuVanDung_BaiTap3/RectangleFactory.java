package _15_2251172299_LuuVanDung_BaiTap3;

public class RectangleFactory extends ShapeFactory {
    private double length;
    private double width;

    public RectangleFactory(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Shape createShape() {
        return new Rectangle(length, width);
    }

    @Override
    public double calculateTotalArea() {
        return createShape().calculateArea();
    }
}