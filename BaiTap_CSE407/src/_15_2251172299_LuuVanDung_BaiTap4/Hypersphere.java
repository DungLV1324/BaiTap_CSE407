package _15_2251172299_LuuVanDung_BaiTap4;

public class Hypersphere implements Shape4D {
    private double radius;

    public Hypersphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double CalculateHyperVolume() {
        return 0.5 * Math.PI * Math.PI * Math.pow(radius, 4);
    }
}
