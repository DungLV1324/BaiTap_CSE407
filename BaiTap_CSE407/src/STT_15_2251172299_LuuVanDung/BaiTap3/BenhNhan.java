package STT_15_2251172299_LuuVanDung.BaiTap3;


import java.util.ArrayList;
import java.util.List;

public class BenhNhan {
    private String ten;
    private List<BacSi> danhSachBacSi;

    public BenhNhan(String ten) {
        this.ten = ten;
        this.danhSachBacSi = new ArrayList<>();
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void themBacSi(BacSi bs) {
        danhSachBacSi.add(bs);
    }
}