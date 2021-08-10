package alaqsa.edu.aqsaastaff.model;

public class MidtermDetection {
    private int studentNo;
    private String studentName;
    private double mark;

    public MidtermDetection() {
    }

    public MidtermDetection(int studentNo, String studentName, double mark) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.mark = mark;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
