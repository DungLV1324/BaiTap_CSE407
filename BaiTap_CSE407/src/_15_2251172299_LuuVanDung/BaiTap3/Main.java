package _15_2251172299_LuuVanDung.BaiTap3;


public class Main {
    public static void main(String[] args) {
        BoNho boNho1 = new BoNho("HDD", 256);
        MayTinh mayTinh1 = new MayTinh("Asus", boNho1);

        mayTinh1.hienThiThongTin();
    }
}