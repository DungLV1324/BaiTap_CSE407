package _15_2251172299_LuuVanDung_BaiTap7;

class Rectangle implements Shape {
    private double length,width,height,perpendicular;

    public Rectangle(double length, double width, double height, double perpendicular){
        this.length = length;
        this.width = width;
        this.height = height;
        this.perpendicular = perpendicular;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculateHyperVolume() {
        return length*width*height*perpendicular;
    }
}