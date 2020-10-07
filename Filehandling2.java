/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class Filehandling2 
{

    /**
     * @param args the command line arguments
     */
    private static String fileExtension(File f)
    {
        String name=f.getName();
        if(name.lastIndexOf(".")!=-1&&name.lastIndexOf(".")!=0)
            return name.substring(name.lastIndexOf(".")+1);
        else
            return "";
    }
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        File f=new File("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\handling1\\src\\handling1\\test.txt");
        System.out.println("Name:"+f.getName());
        if(f.exists())
        {
            System.out.println("The file exists");
        }
        else
        {
            System.out.println("The file does not exists");
        }
        
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.length());
        System.out.println("file extension:"+fileExtension(f));
    }
}
