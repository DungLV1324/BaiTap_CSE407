package STT_15_2251172299_LuuVanDung.BaiTap3;

import java.util.ArrayList;
import java.util.List;

public class BacSi {
    private String ten;
    private List<BenhNhan> danhSachBenhNhan;

    public BacSi(String ten) {
        this.ten = ten;
        this.danhSachBenhNhan = new ArrayList<>();
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void themBenhNhan(BenhNhan bn) {
        danhSachBenhNhan.add(bn);
    }

    public void hienThiDanhSach() {
        System.out.println("Danh sách bệnh nhân của bác sĩ " + ten + "là :");
        for (BenhNhan bn : danhSachBenhNhan) {
            System.out.println("- " + bn.getTen());
        }
    }
}