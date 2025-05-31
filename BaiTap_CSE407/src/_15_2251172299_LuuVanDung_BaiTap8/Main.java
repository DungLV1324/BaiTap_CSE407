package _15_2251172299_LuuVanDung_BaiTap8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 20);
        ShapeMediator mediator = new ShapeMediator();

        mediator.setCircle(circle);
        mediator.setRectangle(rectangle);

        circle.setMediator(mediator);
        rectangle.setMediator(mediator);

        System.out.println("Circle được vẽ:");
        circle.draw();

        System.out.println("\nRectangle được thay đổi kích thước:");
        rectangle.resize();
    }
}
