package alaqsa.edu.aqsaastaff.model;

public class Department {
    private String departmentId;
    private String departmentName;
     private String collageId;


    public Department() {
    }

    public Department(String departmentId, String departmentName,    String collageId     ) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
         this.collageId = collageId;
     }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }



    public String getCollageId() {
        return collageId;
    }

    public void setCollageId(String collageId) {
        this.collageId = collageId;
    }


}
