package BTL.CoVan;

public class Director {
    private CoVanBuilder builder;

    public Director(CoVanBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(CoVanBuilder builder) {
        this.builder = builder;
    }

    public void makeRequest() {
        builder.reset();
        builder.buildStudentInfo();
        builder.buildAdvisorRequest();
        builder.buildApproval();
    }
}
