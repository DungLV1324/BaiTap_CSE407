package _15_2251172299_LuuVanDung_BaiTap5;

public class Main {
    public static void main(String[] args) {
        RectangleBuilder rectangleBuilder = new RectangleBuilder();
        Director director = new Director(rectangleBuilder);
        director.make("rectangle");
        Rectangle rectangle = rectangleBuilder.getResult();
        System.out.println("Build type Rectangle: length = " + rectangle.length + ", width = " + rectangle.width);

        CircleBuilder circleBuilder = new CircleBuilder();
        director.changeBuilder(circleBuilder);
        director.make("circle");
        Circle circle = circleBuilder.getResult();
        System.out.println("Build type Circle: radius = " + circle.radius);
    }
}
