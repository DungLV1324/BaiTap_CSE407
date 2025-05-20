package _15_2251172299_LuuVanDung_BaiTap4;

public class Tesseract {
    private double edge;

    public Tesseract(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public double getHyperVolume() {
        return Math.pow(edge, 4);
    }
}
