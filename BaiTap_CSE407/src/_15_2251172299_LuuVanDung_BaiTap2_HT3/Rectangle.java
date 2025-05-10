package _15_2251172299_LuuVanDung_BaiTap2_HT3;

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double width,double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}