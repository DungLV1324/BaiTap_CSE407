package _15_2251172299_LuuVanDung_BaiTap4;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory1 = new TesseractRectangleFactory();
        Shape4D tesseract = factory1.Create4DShape();
        Shape2D rectangle = factory1.Create2DShape();

        // Giả sử bạn đã thiết kế constructor Tesseract(double a, double b, double c, double d)
        tesseract = new Tesseract(2, 3, 4, 5);
        rectangle = new Rectangle(2, 3);

        System.out.println("Tesseract Hypervolume = " + tesseract.CalculateHyperVolume());
        System.out.println("Rectangle CalculateArea = " + rectangle.CalculateArea());

        System.out.println();

        ShapeFactory factory2 = new HypersphereCircleFactory();
        Shape4D hypersphere = factory2.Create4DShape();
        Shape2D circle = factory2.Create2DShape();

        hypersphere = new Hypersphere(2);
        circle = new Circle(2);

        System.out.println("Hypersphere Hypervolume: = " + hypersphere.CalculateHyperVolume());
        System.out.println("Circle CalculateArea = " + circle.CalculateArea());
    }
}
