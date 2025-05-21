package _15_2251172299_LuuVanDung_BaiTap4;


class Circle implements Shape2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double CalculateArea() {
        return Math.PI * radius * radius;
    }
}