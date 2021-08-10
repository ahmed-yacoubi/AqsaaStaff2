package alaqsa.edu.aqsaastaff.model;

public class StudentsRevealed {
    private int studentId;
    private String studentName;
    private String studentsMajor;
    private int achievementHours;
    private double schoolRate;
    private double GPA;

    
    public StudentsRevealed() {
    }

    public StudentsRevealed(int studentId, String studentName, String studentsMajor, int achievementHours, double schoolRate, double GPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentsMajor = studentsMajor;
        this.achievementHours = achievementHours;
        this.schoolRate = schoolRate;
        this.GPA = GPA;
    }

    public int getstudentId() {
        return studentId;
    }

    public void setstudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentsMajor() {
        return studentsMajor;
    }

    public void setStudentsMajor(String studentsMajor) {
        this.studentsMajor = studentsMajor;
    }

    public int getAchievementHours() {
        return achievementHours;
    }

    public void setAchievementHours(int achievementHours) {
        this.achievementHours = achievementHours;
    }

    public double getSchoolRate() {
        return schoolRate;
    }

    public void setSchoolRate(double schoolRate) {
        this.schoolRate = schoolRate;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
