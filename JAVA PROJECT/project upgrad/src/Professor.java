import java.util.ArrayList;
import java.util.Scanner;

public class Professor {
    public int id;
    public String name;
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> studen;
    Professor()
    {
        studen=new ArrayList<>();
    }
    public void setData(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void displayData()
    {
        System.out.println("Professor Id: "+this.id+" "+"Professor Name: "+this.name);
    }
    public boolean equals(Professor pr)
    {
        if(pr.name.equals(this.name) && pr.id==this.id)
        {
            return true;
        }
        else
        {
            return false;
        }
            
    }
    public void assignStudent(Student studPtr)
    {
        studen.add(studPtr);
    }

}
