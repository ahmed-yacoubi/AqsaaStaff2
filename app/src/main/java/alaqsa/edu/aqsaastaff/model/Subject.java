package alaqsa.edu.aqsaastaff.model;

import java.util.Date;
import java.util.List;

public class Subject {

    private String subjectId;
    private String subjectName;
    private int studentNum;
    private String gender;
    private String division;
    private String finalExamDate;
    private List<String[]> placeTimeLecture;
    private String collage;
    private String department;
    public Subject() {
    }

    public Subject(String subjectId, String subjectName, int studentNum, String gender, String division, String finalExamDate, List<String[]> placeTimeLecture, String collage, String department) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.studentNum = studentNum;
        this.gender = gender;
        this.division = division;
        this.finalExamDate = finalExamDate;
        this.placeTimeLecture = placeTimeLecture;
        this.collage = collage;
        this.department = department;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getFinalExamDate() {
        return finalExamDate;
    }

    public void setFinalExamDate(String finalExamDate) {
        this.finalExamDate = finalExamDate;
    }

    public List<String[]> getPlaceTimeLecture() {
        return placeTimeLecture;
    }

    public void setPlaceTimeLecture(List<String[]> placeTimeLecture) {
        this.placeTimeLecture = placeTimeLecture;
    }
}
