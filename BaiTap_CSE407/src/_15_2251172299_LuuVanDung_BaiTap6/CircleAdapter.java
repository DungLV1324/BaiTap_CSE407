package _15_2251172299_LuuVanDung_BaiTap6;

public class CircleAdapter implements Shape{
	private Circle circleAdapter;

	public CircleAdapter(Circle circle){
		circleAdapter = circle;
	}

	@Override
	public double calculateArea() {
		return circleAdapter.circleArea();
	}
}