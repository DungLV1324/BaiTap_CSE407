package _15_2251172299_LuuVanDung_BaiTap4;

public class Hypersphere implements Shape4D {
    private double radius;

    public Hypersphere(double radius) {
        this.radius = radius;
    }

    public Hypersphere() {
        System.out.println("Hypersphere != null");
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double CalculateHyperVolume() {
        return 0.5 * Math.PI * Math.PI * Math.pow(radius, 4);
    }
}
