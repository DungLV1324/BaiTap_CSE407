package _15_2251172299_LuuVanDung_BaiTap7;

public class Main {

	public static void main(String[] args) {
		ManagerShape manager1 = new ManagerShape(new Circle(5));
		System.out.println("Diện tích hình tròn = "+ manager1.getCalculateArea());
		System.out.println("Siêu thể tích = "+ manager1.getCalculateHyperVolume());
		ManagerShape manager2 = new ManagerShape(new Rectangle(4,3,5,6));
		System.out.println("Diện tích hình chữ nhật =: "+ manager2.getCalculateArea());
		System.out.println("Siêu thể tích "+ manager2.getCalculateHyperVolume());
	}

}