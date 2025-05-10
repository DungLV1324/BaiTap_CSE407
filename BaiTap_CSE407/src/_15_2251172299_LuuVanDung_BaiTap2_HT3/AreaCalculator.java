package _15_2251172299_LuuVanDung_BaiTap2_HT3;

class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape sp : shapes) {
            sum += sp.calculateArea();
        }
        return sum;
    }
}
