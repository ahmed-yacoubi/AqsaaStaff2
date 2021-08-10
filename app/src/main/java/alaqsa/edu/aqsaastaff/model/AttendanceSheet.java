package alaqsa.edu.aqsaastaff.model;

import java.util.ArrayList;
import java.util.List;

public class AttendanceSheet {
    private int studentId;
    private String studentName;
    private List<Boolean> days;

    // id  name 1       2       3       4       5       6       7
    // 22   a   True    True    False   True    True    False
    public AttendanceSheet() {
    }

    public AttendanceSheet(int studentId, String studentName, List<Boolean> days) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.days = days;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Boolean> getDays() {
        return days;
    }

    public void setDays(List<Boolean> days) {
        this.days = days;
    }
}
