package _15_2251172299_LuuVanDung_BaiTap3;

import java.util.Scanner;

class CircleFactory implements ShapeFactory {

    @Override
    public Shape createShape(Scanner scanner) {
        System.out.print("Nhập bán kính hình tròn: ");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }

}