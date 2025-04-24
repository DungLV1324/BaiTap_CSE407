package STT_15_2251172299_LuuVanDung;


import STT_15_2251172299_LuuVanDung.BaiTap3.MayTinh;
import STT_15_2251172299_LuuVanDung.BaiTap3.BoNho;

public class Main {
    public static void main(String[] args) {
        BoNho boNho1 = new BoNho("HDD", 256);
        MayTinh mayTinh1 = new MayTinh("Asus", boNho1);

        mayTinh1.hienThiThongTin();
    }
}