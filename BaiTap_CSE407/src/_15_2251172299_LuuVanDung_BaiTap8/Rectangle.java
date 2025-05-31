package _15_2251172299_LuuVanDung_BaiTap8;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void resize() {
        System.out.println("Thay đổi kích thước hình chữ nhật thành " + length + " x " + width);
        changed("resize");
    }
}
