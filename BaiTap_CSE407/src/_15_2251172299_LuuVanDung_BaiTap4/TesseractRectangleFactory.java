package _15_2251172299_LuuVanDung_BaiTap4;

public class TesseractRectangleFactory implements ShapeFactory{
	private double length,width,height,perpendicular;

	@Override
	public Shape2D Create2DShape() {
		return new Rectangle(length,width);
	}

	@Override
	public Shape4D Create4DShape() {
		return new Tesseract(length,width,height,perpendicular);
	}
}