package BTL.CoVan;

public class Client {
    public static void main(String[] args) {
        // Bước 1: Sinh viên chọn giảng viên
        SinhVienAdvisorBuilder studentBuilder = new SinhVienAdvisorBuilder();
        Director director = new Director(studentBuilder);
        director.makeRequest();
        SinhVien sinhVien = studentBuilder.getResult();
        System.out.println("Sinh viên request: " + sinhVien);

        // Bước 2: Giảng viên duyệt sinh viên
        GiangVienApprovalBuilder lecturerBuilder = new GiangVienApprovalBuilder();
        director.changeBuilder(lecturerBuilder);
        director.makeRequest();
        GiangVien giangVien = lecturerBuilder.getResult();
        System.out.println("Giảng viên approval: " + giangVien);
    }
}
