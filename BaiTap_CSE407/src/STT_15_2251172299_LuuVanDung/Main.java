package STT_15_2251172299_LuuVanDung;


import STT_15_2251172299_LuuVanDung.BaiTap3.BacSi;
import STT_15_2251172299_LuuVanDung.BaiTap3.BenhNhan;

public class Main {
    public static void main(String[] args) {
        BacSi bacSi1 = new BacSi("Dr.Dũng");
        BenhNhan bn1 = new BenhNhan("Linh");
        BenhNhan bn2 = new BenhNhan("Phương");

        // Thêm bệnh nhân
        bacSi1.themBenhNhan(bn1);
        bacSi1.themBenhNhan(bn2);

        // Thêm bác sĩ
        bn1.themBacSi(bacSi1);
        bn2.themBacSi(bacSi1);

        bacSi1.hienThiDanhSach();
    }
}