package _15_2251172299_LuuVanDung_BaiTap4;

class Rectangle implements Shape2D {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        System.out.println("Rectangle != null");
    }

    @Override
    public double CalculateArea() {
        return length * width;
    }
}