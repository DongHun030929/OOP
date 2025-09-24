public class Student {
    private long studentId;
    private String name;
    private String major;
    private long phoneNumber;

    public Student(long studentId, String name, String major, long phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFormattedPhoneNumber() {
        String phoneStr = "0" + Long.toString(this.phoneNumber);
        return phoneStr.substring(0, 3) + "-" +
                phoneStr.substring(3, 7) + "-" +
                phoneStr.substring(7);
    }
}