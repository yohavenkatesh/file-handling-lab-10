/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbyte;

/**
 *
 * @author ADMIN
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Byte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream fin=null;
        FileOutputStream fout=null;
          
        fin=new FileInputStream("input.jpg");
        fout=new FileOutputStream("output.jpg");
        int i;
        while((i=fin.read())!=-1)
            fout.write(i);
        
        fin.close();
        fout.close();
    }
    
}
