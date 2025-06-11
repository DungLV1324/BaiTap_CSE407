package BTL.CoVan;

public class SinhVienAdvisorBuilder implements CoVanBuilder {
    private SinhVien sinhVien;

    public SinhVien getResult() {
        return sinhVien;
    }

    @Override
    public void reset() {
        sinhVien = new SinhVien();
    }

    @Override
    public void buildThongTinSinhVien() {
        sinhVien.ten = "Nguyen Van A";
        sinhVien.ma_sv = "SV001";
    }

    @Override
    public void buildYeuCauCoVan() {
        sinhVien.requestedGiangVien = "Dr. Tran B";
    }

    @Override
    public void buildPheDuyet() {
        // Student cannot approve, so leave empty or log
    }
}
