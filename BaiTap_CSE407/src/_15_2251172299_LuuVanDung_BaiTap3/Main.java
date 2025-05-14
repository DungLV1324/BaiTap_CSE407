package _15_2251172299_LuuVanDung_BaiTap3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory rectangleFactory = new RectangleFactory(10,12);
        ShapeFactory circleFactory = new CircleFactory(13);

        System.out.println("Diện tích hình tròn = "+circleFactory.calculateTotalArea());
        System.out.println("Diện tích hình chữ nhật = : "+rectangleFactory.calculateTotalArea());
    }
}