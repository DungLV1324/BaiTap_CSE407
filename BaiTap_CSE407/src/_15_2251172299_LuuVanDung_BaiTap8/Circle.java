package _15_2251172299_LuuVanDung_BaiTap8;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Vẽ circle có bán kính: " + radius);
        changed("draw");
    }
}
