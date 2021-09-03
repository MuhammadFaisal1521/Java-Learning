/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectclassintroduction;

import School.Student;

/**
 *
 * @author m.faisal1521
 */
public class ObjectClassIntroduction extends Student{

    /**
     * @param args the command line arguments
     * Public / Protector / Private
     * Procedue  / Function 
     * Static  / Non-Static
     */
    
    public static void main(String[] args) {
        
        
        Student AmirManzoor = new Student();
        AmirManzoor.setStudentId(100);
        AmirManzoor.setStudentName("Amir Manzoor");
        
        
        
        Student AliHassan = new Student();
        AliHassan.setStudentId(101);
        AliHassan.setStudentName("Ali Hassan");
        
        System.out.println(AmirManzoor.getStudentId()+ " "+AmirManzoor.getStudentName());
        System.out.println(AliHassan.getStudentId()+ " "+AliHassan.getStudentName());
        System.out.println(Student.getSchoolName());
        
    }

    
    
}
