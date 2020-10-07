/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.handling.pkg1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
class student implements Serializable
{
    
    String name;
    int rollno;
    student(String n,int r)
    {
        name=n;
        rollno=r;
    }
    public String toString()
    {
        return "name:"+name+"<->"+"rollno:"+rollno;
    }
}
public class FileHandling1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException
    {
       
        DataInputStream ds=new DataInputStream(System.in);
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("C:\\\\Users\\\\ADMIN\\\\Documents\\\\NetBeansProjects\\\\file handling 1\\\\src\\\\file\\\\handling\\\\pkg1\\\\demo"));
        System.out.println("enter the no of student:");
        int n=Integer.parseInt(ds.readLine());
        student s[]=new student[n];
        String name;
        int rollno;
        
        for(int i=0;i<n;i++)
        {
            System.out.println("enter name of the student:");
            name=ds.readLine();
            System.out.println("enter roll number:");
            rollno=(int) Double.parseDouble(ds.readLine());
            s[i]=new student(name,rollno);
            obj.writeObject(s[i]);
        }
      
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\ADMIN\\\\Documents\\\\NetBeansProjects\\\\file handling 1\\\\src\\\\file\\\\handling\\\\pkg1\\\\demo"));
        while(n>0)
        {
            System.out.println(obj1.readObject());
            n--;
        }
        
        FileReader r=new FileReader("C:\\\\Users\\\\ADMIN\\\\Documents\\\\NetBeansProjects\\\\file handling 1\\\\src\\\\file\\\\handling\\\\pkg1\\\\demo");
        FileWriter w=new FileWriter("C:\\\\Users\\\\ADMIN\\\\Documents\\\\NetBeansProjects\\\\file handling 1\\\\src\\\\file\\\\handling\\\\pkg1\\\\demo.txt");
        int character=' ';
        char m;
        while((character=r.read())!=-1)
        {
            m=Character.toLowerCase((char)character);
            System.out.println(m);
            w.write(m);
        }
         
        r.close();
        w.close();
        obj.close();
        obj1.close();
    }
    
}
