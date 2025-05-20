package _15_2251172299_LuuVanDung_BaiTap4;

public class TesseractRectangleFactory implements ShapeFactory{
	@Override
	public Shape2D Create2DShape() {
		return new Rectangle();
	}

	@Override
	public Shape4D Create4DShape() {
		return new Tesseract();
	}
}