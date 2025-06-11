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
    public void buildStudentInfo() {
        sinhVien.name = "Nguyen Van A";
        sinhVien.id = "SV001";
    }

    @Override
    public void buildAdvisorRequest() {
        sinhVien.requestedLecturer = "Dr. Tran B";
    }

    @Override
    public void buildApproval() {
        // Student cannot approve, so leave empty or log
    }
}
