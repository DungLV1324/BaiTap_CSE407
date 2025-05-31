package _15_2251172299_LuuVanDung_BaiTap8;

public class ShapeMediator implements Mediator {
    private Circle circle;
    private Rectangle rectangle;

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void notify(Shape sender, String event) {
        if (sender == circle) {
            onCircleChanged();
        } else if (sender == rectangle) {
            onRectangleChanged();
        }
    }

    private void onCircleChanged() {
        System.out.println("Mediator phản ứng với sự thay đổi của Circle và kích hoạt Rectangle.");
        if (rectangle != null) {
            rectangle.isInternalChange = true;
            rectangle.resize();
            rectangle.isInternalChange = false;
        }
    }

    private void onRectangleChanged() {
        System.out.println("Mediator phản ứng với sự thay đổi của Rectangle và kích hoạt Circle.");
        if (circle != null) {
            circle.isInternalChange = true;
            circle.draw();
            circle.isInternalChange = false;
        }
    }

}
