/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School;

/**
 *
 * @author m.faisal1521
 */
public class Student {
    
    private int StudentId;
    private String StudentName;
    private static String SchoolName;

    /**
     * @return the StudentId
     */
    public int getStudentId() {
        return StudentId;
    }

    /**
     * @param StudentId the StudentId to set
     */
    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    /**
     * @return the StudentName
     */
    public String getStudentName() {
        return StudentName +" "+ Student.getSchoolName() ;
    }

    /**
     * @param StudentName the StudentName to set
     */
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
        Student.setSchoolName(StudentName);
    }

    /**
     * @return the SchoolName
     */
    public static String getSchoolName() {
        return SchoolName;
    }

    /**
     * @param aSchoolName the SchoolName to set
     */
    public static void setSchoolName(String aSchoolName) {
        SchoolName = aSchoolName;
    }
}
