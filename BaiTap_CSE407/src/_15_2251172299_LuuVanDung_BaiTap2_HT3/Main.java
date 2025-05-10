package _15_2251172299_LuuVanDung_BaiTap2_HT3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        double radius = scanner.nextDouble();
        Shape tron = new Circle(radius);

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double width = scanner.nextDouble();
        Shape chuNhat = new Rectangle(length, width);

        Shape[] shapes = {tron, chuNhat};
        Shape[] shapeT = {tron};
        Shape[] shapeCN = {chuNhat};

        AreaCalculator areaCalculator = new AreaCalculator();
        double sumArea = areaCalculator.calculateTotalArea(shapes);
        double sumTron = areaCalculator.calculateTotalArea(shapeT);
        double sumChuNhat = areaCalculator.calculateTotalArea(shapeCN);

        System.out.println("Diện tích của hình tròn = " + sumTron);
        System.out.println("Diện tích của hình chữ nhật = " + sumChuNhat);
        System.out.println("Tổng diện tích của hình tròn và hình chữ nhật = " + sumArea);
    }
}