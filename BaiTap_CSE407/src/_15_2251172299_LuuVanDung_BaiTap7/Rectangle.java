package _15_2251172299_LuuVanDung_BaiTap7;

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double rectangleArea() {
        return length * width;
    }
}