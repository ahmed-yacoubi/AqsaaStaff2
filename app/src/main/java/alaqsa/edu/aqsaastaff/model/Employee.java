package alaqsa.edu.aqsaastaff.model;

public class Employee {
    private String name;
    private String password;
    private String img;
    private String city;
    private String personalEmail;
    private String collegeEmail;
    private String phoneNo;
    private String jobTitle;
    private String collegeId;
    private String departmentId;
    private String Specialization;


    public Employee() {
    }

    public Employee(String name, String password, String img, String city, String personalEmail, String collegeEmail, String phoneNo, String jobTitle, String collegeId, String departmentId, String specialization) {
        this.name = name;
        this.password = password;
        this.img = img;
        this.city = city;
        this.personalEmail = personalEmail;
        this.collegeEmail = collegeEmail;
        this.phoneNo = phoneNo;
        this.jobTitle = jobTitle;
        this.collegeId = collegeId;
        this.departmentId = departmentId;
        Specialization = specialization;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getCollegeEmail() {
        return collegeEmail;
    }

    public void setCollegeEmail(String collegeEmail) {
        this.collegeEmail = collegeEmail;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


}
