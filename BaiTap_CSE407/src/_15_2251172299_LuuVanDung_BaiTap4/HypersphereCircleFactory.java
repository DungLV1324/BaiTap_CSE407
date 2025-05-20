package _15_2251172299_LuuVanDung_BaiTap4;

public class HypersphereCircleFactory implements ShapeFactory  {

	@Override
	public Shape2D Create2DShape() {
		return new Circle();
	}

	@Override
	public Shape4D Create4DShape() {
		return new Hypersphere();
	}

}