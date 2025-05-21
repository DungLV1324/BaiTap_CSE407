package _15_2251172299_LuuVanDung_BaiTap4;

public class HypersphereCircleFactory implements ShapeFactory  {
	private double radius;

	@Override
	public Shape2D Create2DShape() {
		return new Circle(radius);
	}

	@Override
	public Shape4D Create4DShape() {
		return new Hypersphere(radius);
	}

}