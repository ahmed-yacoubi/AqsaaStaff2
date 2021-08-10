package alaqsa.edu.aqsaastaff.temp;

import android.app.Activity;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import alaqsa.edu.aqsaastaff.model.College;
import alaqsa.edu.aqsaastaff.model.Department;
import alaqsa.edu.aqsaastaff.model.Employee;
import alaqsa.edu.aqsaastaff.model.StudentInfo;
import alaqsa.edu.aqsaastaff.model.Subject;

public class TemporaryData {
    Activity activity;
    SharedPreferences sp;

    public TemporaryData(Activity activity) {
        this.activity = activity;
    }


    public void dataGeneration() {


    }

    private List<College> setCollages() {

        List<College> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            College college = new College();
            college.setCollageId("c" + i);
            college.setCollageName("collage" + i);
            list.add(college);
        }
        return list;
    }

    private List<Department> setDepartments() {
        List<Department> list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Department department = new Department();
            department.setCollageId("c2");
            department.setDepartmentId("dep" + i);
            department.setDepartmentName("department " + i);
            list.add(department);
        }
        return list;
    }

    private Employee setEmployeeData() {
        Employee employee = new Employee();
        employee.setCity("Gaza");
        employee.setName("ahmed");
        employee.setImg(null);
        employee.setJobTitle("Doctor");
        employee.setCollegeId("c2");
        employee.setDepartmentId("dep1");
        employee.setPhoneNo("0599967638");
        employee.setPersonalEmail("ahmeddev1999@gmail.com");
        employee.setCollegeEmail("ahmed@aqsa.com");
        employee.setPassword("123123123");

        return employee;
    }

    private List<Employee> setEmployees() {
        List<Employee> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Employee employee = new Employee();
            employee.setCity("Gaza");
            employee.setName("ahmed");
            employee.setImg(null);
            employee.setJobTitle("Doctor");
            employee.setCollegeId("c2");
            employee.setDepartmentId("dep1");
            employee.setPhoneNo("05999676" + i);
            employee.setPersonalEmail("ahmeddev1999@gmail.com");
            employee.setCollegeEmail("ahmed@aqsa.com");
            list.add(employee);
        }
        return list;
    }

    private List<StudentInfo> setStudentsInfo() {
        List<StudentInfo> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            StudentInfo studentInfo = new StudentInfo();
            studentInfo.setCity("Rafah" + i);
            studentInfo.setAddress("My Address" + i);
            studentInfo.setAchievementHours(100 + i);
            studentInfo.setGPA(80 + i);
            studentInfo.setLevel(4);
            studentInfo.setPhoneNo("059996668" + i);
            studentInfo.setSchoolRate(85 + i);
            studentInfo.setStudentName("Student " + i);
            studentInfo.setStudentId(130118120 + i);
            studentInfo.setDepartment("dep1");
            studentInfo.setCollage("c2");
            list.add(studentInfo);
        }
        return list;

    }

    private List<Subject> setSubjects() {
        List<Subject> list = new ArrayList<>();
        for (int i = 100; i <= 105; i++) {
            Subject subject = new Subject();
            subject.setFinalExamDate("2021/12/29");
            subject.setDivision("Division" + i);
            subject.setCollage("c2");
            subject.setDivision("dep1");
            if (i % 2 == 0)
                subject.setGender("male");
            else
                subject.setGender("female");

            subject.setStudentNum(i);
            List<String[]> place = new ArrayList<>();
            place.add(new String[]{"غزة-مبنى الوحدة P230", "12-14PM"});
            place.add(new String[]{"خان يونس البحر - L301", "10-12PM"});
            subject.setPlaceTimeLecture(place);
            subject.setSubjectId("TCIS3" + i);
            subject.setSubjectName("Java" + i);
            list.add(subject);
        }
        return list;

    }

    private void registrationSubjectStudent(List<Subject> subjects, List<StudentInfo>
            students) {

        Random randomGenerator = new Random();


        for (StudentInfo s : students) {
            int index = randomGenerator.nextInt(subjects.size());

            regStudent(s.getStudentId(), subjects.get(index).getSubjectId());

        }

    }

    private void regStudent(int studentId, String subjectId) {// this method in database
        // stdId  subId
        //  2      3
    }

}
