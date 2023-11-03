public class Student {
    private String studName;
    private int studId;

    public Student(String studName, int studId) {
        this.studName = studName;
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public int getStudId() {
        return studId;
    }
}