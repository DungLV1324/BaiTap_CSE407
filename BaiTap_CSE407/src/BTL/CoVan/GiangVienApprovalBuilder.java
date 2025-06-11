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
    public void buildStudentInfo() {
        giangVien.approvedStudent = "Nguyen Van A";
    }

    @Override
    public void buildAdvisorRequest() {
        // No action needed
    }

    @Override
    public void buildApproval() {
        giangVien.name = "Dr. Tran B";
        giangVien.department = "Computer Science";
    }
}
