package _15_2251172299_LuuVanDung_BaiTap4;

public class Tesseract implements Shape4D{
    private double length,width,height,perpendicular;

  public Tesseract(double length, double width, double height, double perpendicular){
      this.length = length;
      this.width = width;
      this.height = height;
      this.perpendicular = perpendicular;
  }

    @Override
    public double CalculateHyperVolume() {
        return length*width*height*perpendicular;
    }
}
