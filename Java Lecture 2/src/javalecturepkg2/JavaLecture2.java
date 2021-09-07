/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalecturepkg2;

import GUI.DisplayScreenForSchoolResult;
import GUI.SchoolNotificationBoard;

/**
 *
 * @author m.faisal1521
 */
public class JavaLecture2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DisplayScreenForSchoolResult console = new DisplayScreenForSchoolResult();
        console.show();
        
         DisplayScreenForSchoolResult.displayText("Class Started ");
         
        SchoolNotificationBoard notify = new SchoolNotificationBoard();
    }
    
}
