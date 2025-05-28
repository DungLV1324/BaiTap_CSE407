package _15_2251172299_LuuVanDung_BaiTap6;

public class Main {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(12,12);
		Circle circle = new Circle(12);

		RectangleAdapter rectangleAdapter = new RectangleAdapter(rectangle);
		CircleAdapter circleAdapter = new CircleAdapter(circle);

		System.out.println("Diện tích hình tròn = "+circleAdapter.calculateArea());
		System.out.println("Diện tích hình chữ nhật = "+rectangleAdapter.calculateArea());
	}
}