package _15_2251172299_LuuVanDung_BaiTap3;

import java.util.Scanner;

class RectangleFactory implements ShapeFactory {

    public Shape createShape(Scanner scanner) {
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }
}
