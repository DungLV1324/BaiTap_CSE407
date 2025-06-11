package BTL.CoVan;

public class GiangVienApprovalBuilder implements CoVanBuilder {
    private GiangVien giangVien;

    public GiangVien getResult() {
        return giangVien;
    }

    @Override
    public void reset() {
        giangVien = new GiangVien();
    }

    @Override
    public void buildThongTinSinhVien() {
        giangVien.approvedSinhVien = "Nguyen Van A";
    }

    @Override
    public void buildYeuCauCoVan() {
        // No action needed
    }

    @Override
    public void buildPheDuyet() {
        giangVien.ten = "Dr. Tran B";
        giangVien.ma_gv = "GV007";
    }
}
