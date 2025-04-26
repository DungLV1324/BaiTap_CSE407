package STT_15_2251172299_LuuVanDung.BaiTap3;


public class BoNho {
    private String loai;
    private int dungLuong;

    public BoNho(String loai, int dungLuong) {
        this.loai = loai;
        this.dungLuong = dungLuong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }
}
