/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author m.faisal1521
 */
public class SchoolNotificationBoard implements Runnable {

    public SchoolNotificationBoard() {
        
            
        
        Thread notifyThread = new Thread(this);
        notifyThread.setName("SCHOOL Notification");
        notifyThread.start(); // Start Thread
    }
    
 
    
   

    @Override
    public void run() {
          
        if (Thread.currentThread().getName().equals("SCHOOL Notification"))
              
        {
                    for (int ldx=0;ldx<10000;ldx++)
                    {
                        try {
                            DisplayScreenForSchoolResult.displayText("Notify no: "+ldx);
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(SchoolNotificationBoard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
    }
    
}
