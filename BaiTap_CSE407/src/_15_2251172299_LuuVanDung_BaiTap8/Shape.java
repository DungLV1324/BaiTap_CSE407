package _15_2251172299_LuuVanDung_BaiTap8;

public abstract class Shape {
    protected Mediator mediator;
    protected boolean isInternalChange = false;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed(String event) {
        if (!isInternalChange && mediator != null) {
            mediator.notify(this, event);
        }
    }
}