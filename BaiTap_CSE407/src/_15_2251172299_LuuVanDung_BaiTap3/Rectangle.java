package _15_2251172299_LuuVanDung_BaiTap3;


class Rectangle implements Shape {
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