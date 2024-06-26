
package Windows;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
    
    public void writeText(Person p){
        try {
            FileWriter writeFile = new FileWriter(file, true);
            writeFile.write(p.getName() + "," + p.getEmail() + "," + p.getNumber() + "\r\n");
            writeFile.close();
            
        } catch (IOException ex) {
            System.err.println("Error, " + ex);
        }
    }
}
