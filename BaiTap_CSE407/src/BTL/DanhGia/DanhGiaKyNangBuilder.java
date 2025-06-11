package BTL.DanhGia;

public class DanhGiaKyNangBuilder implements DanhGiaBuilder {
    private DanhGia danhGia;

    public DanhGiaKyNangBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        danhGia = new DanhGia();
    }

    @Override
    public void buildKyNang() {
        danhGia.kyNang = "Kỹ năng lập trình xuất sắc";
    }

    @Override
    public void buildThaiDo() {
        danhGia.thaiDo = "Thái độ tích cực, cầu tiến";
    }

    @Override
    public void buildNoiDungKhac() {
        danhGia.noiDungKhac = "Có khả năng làm việc nhóm tốt";
    }

    public DanhGia getResult() {
        return danhGia;
    }
}
