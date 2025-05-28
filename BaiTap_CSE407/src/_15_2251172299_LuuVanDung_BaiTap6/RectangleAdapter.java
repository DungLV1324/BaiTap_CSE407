package _15_2251172299_LuuVanDung_BaiTap6;

public class RectangleAdapter implements Shape{
	private Rectangle rectangleAdapter;

	public RectangleAdapter(Rectangle rectangle) {
		rectangleAdapter = rectangle;
	}


	@Override
	public double calculateArea() {
		return rectangleAdapter.rectangleArea();
	}
}