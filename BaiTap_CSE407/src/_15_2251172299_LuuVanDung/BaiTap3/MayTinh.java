package _15_2251172299_LuuVanDung.BaiTap3;

public class MayTinh {
    private String ten;
    private BoNho boNho;

    public MayTinh(String ten, BoNho boNho) {
        this.ten = ten;
        this.boNho = boNho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void hienThiThongTin() {
        System.out.println("Tên máy tính là : " + ten);
        System.out.println("Loại bộ nhớ là : " + boNho.getLoai());
        System.out.println("Dung lượng bộ nhớ là : " + boNho.getDungLuong() + " GB");
    }
}