package _15_2251172299_LuuVanDung_BaiTap7;

public class ManagerShape {
	private Shape shapes;

	ManagerShape(Shape shape){
		shapes = shape;
	}
	public double getCalculateArea() {
		return shapes.calculateArea();
	}
	public double getCalculateHyperVolume() {
		return shapes.calculateHyperVolume();
	}
}