package _15_2251172299_LuuVanDung_BaiTap4;

public class Tesseract implements Shape4D{
    private double edge;

    public Tesseract(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public Tesseract() {
        System.out.println("Tesseract != null");
    }


    @Override
    public double CalculateHyperVolume() {
        return Math.pow(edge, 4);
    }
}
