package BTL.DanhGia;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo builder
        DanhGiaKyNangBuilder builderKyNang = new DanhGiaKyNangBuilder();

        // Khởi tạo director
        DoanhNghiep doanhNghiep = new DoanhNghiep(builderKyNang);

        // Xây dựng đánh giá
        doanhNghiep.danhGiaSinhVien();
        DanhGia danhGia1 = builderKyNang.getResult();

        // Sinh viên xem đánh giá
        SinhVien sv = new SinhVien();
        sv.xemDanhGia(danhGia1);

        // Chuyển sang builder khác
        DanhGiaThaiDoBuilder builderThaiDo = new DanhGiaThaiDoBuilder();
        doanhNghiep.changeBuilder(builderThaiDo);
        doanhNghiep.danhGiaSinhVien();
        DanhGia danhGia2 = builderThaiDo.getResult();

        sv.xemDanhGia(danhGia2);
    }
}
