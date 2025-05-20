package _15_2251172299_LuuVanDung_BaiTap4;

public class Hypersphere {
    private double radius;

    public Hypersphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getHyperVolume() {
        return 0.5 * Math.PI * Math.PI * Math.pow(radius, 4);
    }
}
