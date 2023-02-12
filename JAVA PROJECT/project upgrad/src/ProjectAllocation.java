import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ProjectAllocation{
    static ArrayList<Project> project;
    static ArrayList<Student> student;
    static ArrayList<Professor> professor;
    static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        project=new ArrayList<>();
        student=new ArrayList<>();
        professor=new ArrayList<>();
        System.out.println("--------------ENTER PROJECT DETAILS--------------");
        System.out.println();
        ForProject();
        System.out.println("--------------ENTER PROFESSOR DETAILS--------------");
        System.out.println();
        ForProfessor(); 
        System.out.println("--------------ENTER STUDENT DETAILS--------------");
        System.out.println();
        ForStudent();
        System.out.println("==============ENTER THE BELOW DETAILS==============");
        System.out.println();
        AskforAssignment();      
        System.out.println("==============THE LIST OF PROJECTS ASSIGNED TO STUDENTS UNDER PROFESSORS==============");
        DisplayDatas();
    }
    private static void ForProfessor()
    {
        for(int i=0;i<3;i++)
        {
            Professor pro=new Professor();
            System.out.println("Enter professor id");
            int profid=sc.nextInt();
            System.out.println("Enter professor name");
            String name=sc.next();
            pro.setData(profid, name);
            boolean k=IsprofOrNot(pro);
            while(true)
            {
                if(k==true)
                {
                   System.out.println("The professor already exists");
                   System.out.println("Enter another professor");
                   profid=sc.nextInt();
                   System.out.println("Enter professor name");
                   name=sc.next();
                   pro.setData(profid, name);
                   k=IsprofOrNot(pro);
                }
            else
               {
                professor.add(pro);
                System.out.println("professor added successfully");
                break;
               }
            }
        
        }
    }
    private static void ForProject()
    {
       
        for(int i=0;i<7;i++)
        {
            Project pro=new Project();
            System.out.println("Enter project id:");
            int id=sc.nextInt();
            System.out.println("Enter project name: ");
            String name=sc.next();
            pro.setData(id, name);
            boolean l=isPresentOrNot(pro);
            while(true)
                if(l==true)
                {
                    System.out.println("The project already exists"); 
                    System.out.println("Enter Another project id");
                    id=sc.nextInt();
                    System.out.println("Enter Another project name");
                    name=sc.next();
                    pro.setData(id, name);
                    l=isPresentOrNot(pro);
                }
                else
                {
                   project.add(pro);
                   System.out.println("The project added successfully");
                   break;
                }
        }
    }
    private static void ForStudent()
    {
        for(int i=0;i<5;i++)
        {
            Student st=new Student();
            System.out.println("Enter student id");
            int stuid=sc.nextInt();
            System.out.println("Enter student name");
            String stuname=sc.next();
            st.setData(stuid,stuname);
            boolean j=IsStudentOrNot(st);
            while(true)
            {                
                if(j==true)
                {
                   System.out.println("Student already exists");
                   System.out.println("Enter another student id");
                   stuid=sc.nextInt();
                   System.out.println("Enter another student name");
                   stuname=sc.next();
                   st.setData(stuid, stuname);
                   j=IsStudentOrNot(st);
                }
                else{
                    student.add(st);
                    System.out.println("Student added successfully");
                    break;
                }
            }
        }
    }    
    private  static boolean isPresentOrNot(Project pro)
    {
            for(Project pr:project)
            {
            if(pr.equals(pro))
                  return true;
            }
            return false;
        
    }
    private static boolean IsStudentOrNot(Student stu)
    {      
        for(Student s:student)
        {
         if(s.equals(stu))
         {
             return true;                
         }
        }
        return false;
        
    }
    private static boolean IsprofOrNot(Professor pro)      
    {
            for(Professor prof:professor)
            {
                if(prof.equals(pro))
                   return true;
            }
            return false;
        
    }
    private static void AskforAssignment()
    {
        for(Professor prof:professor)
        {
            System.out.println("Enter the student name under professor:  "+prof.name.toUpperCase());
            String studname=sc.nextLine();
            String ch="yes";
            while(ch.equals("yes")||ch.equals("YES"))
            {
            System.out.print("Enter the student name:  ");
            studname=sc.nextLine();
            Student studentsptr=GetStudentPtr(studname);
            while(studentsptr==null)
            {
                System.out.println("Student does not exists");
                System.out.println("Enter another student name");
                studname=sc.nextLine();
                studentsptr=GetStudentPtr(studname);
            }
            System.out.println("Enter the project to be assigned to:"+studname.toUpperCase());
            String projectname=sc.next();
            Project ptrproject=GetProjectPtr(projectname);
            while(ptrproject==null)
            {
                 System.out.println("The project does not exists");
                  System.out.println("Enter another project name:");
                  projectname=sc.next();
                  ptrproject=GetProjectPtr(projectname);
            }
            if(Assignment.assignProject(prof, studentsptr, ptrproject))
            {
              System.out.println("Project assigned successfully");
            }
            else 
            {
               System.out.println("Could not assign project");
            }
            System.out.println("Do you need to enter another student under professor "+prof.name.toUpperCase()+"?  YES/NO");
            ch=sc.next();
            }
        
        }
    }
    private static Student GetStudentPtr(String name)
    {
           for(Student stu:student)
           {
              if(stu.studentName.equals(name))
                 return stu;
           }
           return null;
    }
    private static Project GetProjectPtr(String name)
    {
        for(Project pro:project)
        {
            if(pro.ProjectTitle.equals(name))
               return pro;
        }
        return null;
    }
    private static void DisplayDatas()
    {
        for(Professor prof:professor)
        {
            System.out.println("Professor id: "+prof.id);
            System.out.println("Professor name: "+prof.name);
            for(Student student:prof.studen)
            {
                System.out.println("Student id: "+student.studentid);
                System.out.println("Student name: "+student.studentName);
                System.out.println("Project id: "+student.ptrProject.projectId);
                System.out.println("Project Title: "+student.ptrProject.ProjectTitle);
            }
        }
        System.out.println("----------------END OF THE DATA BASE----------------");
    }
}

    

        


                

            
            
            

            
            
  











