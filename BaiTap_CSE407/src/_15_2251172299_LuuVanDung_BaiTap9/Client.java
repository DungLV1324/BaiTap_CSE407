package _15_2251172299_LuuVanDung_BaiTap9;

public class Client {
    public static void main(String[] args) {
        ShapeStrategyContext shapeStrategyContext = new ShapeStrategyContext();

        ShapeDrawStrategy circle = new CircleShapeDrawStrategy();
        shapeStrategyContext.setStrategy(circle);
        shapeStrategyContext.render();

        ShapeDrawStrategy rectangle = new RectangleShapeDrawStrategy();
        shapeStrategyContext.setStrategy(rectangle);
        shapeStrategyContext.render();
    }
}