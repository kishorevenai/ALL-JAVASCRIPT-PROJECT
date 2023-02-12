import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Student {
    int studentid;
    String studentName;
    Project ptrProject;
    Professor ptrProfessor;
    Scanner tc=new Scanner(System.in);
    public void setData(int id,String name)
    {
        
        this.studentName=name;
        this.studentid=id;
    }
    public void displayData()
    {
        System.out.println("Student Name: "+studentName+" "+"Student Id: "+studentid);
    }
    public boolean equals(Student s) 
    {
      if(s.studentName.equals(this.studentName) && s.studentid==this.studentid)
          return true;
      else
          return false;
    }
    public void setname(String name)
    {
        this.studentName=name;
    }
    public void setid(int id)
    {
        this.studentid=id;
    }
   public Project getProjectDetails()
   {
        return this.ptrProject;
   }
   public Professor getprofessorDetails()
   {
        return this.ptrProfessor;
   }
    public void asssignProject(Project ptrPro)
    {
       this.ptrProject=ptrPro;

    }
    public void assignProfessor(Professor ptrProf)
    {
       this.ptrProfessor=ptrProf;   
    }
   
}
