
package Windows;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileEditor {
    private File file;
    
    public void makeFile(){
        try {
            file = new File("ContactBook.txt");
            
            if(file.createNewFile()){
                //Make File
                
            }
        } catch (IOException ex) {
            System.err.println("Error, " + ex);
        }
    }
}
