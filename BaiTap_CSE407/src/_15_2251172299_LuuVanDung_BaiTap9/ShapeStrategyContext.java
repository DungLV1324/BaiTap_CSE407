package _15_2251172299_LuuVanDung_BaiTap9;

public class ShapeStrategyContext {
    private ShapeDrawStrategy strategy;

    public void setStrategy(ShapeDrawStrategy strategy) {
        this.strategy = strategy;
    }

    public void render() {
        strategy.draw("Hiển thị dữ liệu ");
    }
}