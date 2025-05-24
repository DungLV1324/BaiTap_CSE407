package _15_2251172299_LuuVanDung_BaiTap5;

public class CircleBuilder implements ShapeBuilder {
	Circle circle = new Circle();

	@Override
	public void reset() {
		circle = new Circle();
	}

	@Override
	public void buildType() {
		circle.type = "Type Circle";
	}

	@Override
	public void buildRadius() {
		circle.setRadius(12);
	}

	@Override
	public void buildLength() {
	}

	@Override
	public void buildWidth() {
	}
}