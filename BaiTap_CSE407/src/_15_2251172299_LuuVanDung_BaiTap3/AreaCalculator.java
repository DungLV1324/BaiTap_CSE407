package _15_2251172299_LuuVanDung_BaiTap3;

public class AreaCalculator {
    public static double calculateTotalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape sp : shapes) {
            sum += sp.calculateArea();
        }
        return sum;
    }
}
