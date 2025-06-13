package _15_2251172299_LuuVanDung_BaiTap5;

public class RectangleBuilder implements ShapeBuilder {
	Rectangle rectangle = new Rectangle();

	@Override
	public void reset() {
		rectangle = new Rectangle();
	}


	public Rectangle getResult() {
		return rectangle;
	}

	@Override
	public void buildType() {
		rectangle.type = "Type Rectangle";
	}

	@Override
	public void buildRadius() {
	}

	@Override
	public void buildLength() {
		rectangle.setLength(12);
	}

	@Override
	public void buildWidth() {
		rectangle.setWidth(12);
	}
}