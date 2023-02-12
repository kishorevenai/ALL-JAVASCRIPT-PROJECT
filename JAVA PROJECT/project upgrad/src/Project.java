import java.util.Scanner;

public class Project {
    int projectId;
    String ProjectTitle;
    Scanner sc=new Scanner(System.in);
    public void setData(int id,String title)
    {
        this.projectId=id;
        this.ProjectTitle=title;
    }
    public void displayData()
    {
        System.out.println("Project Title: "+ProjectTitle+" Project Id: "+projectId);
    }
    public boolean equals(Project pro)
    {
       if(pro.ProjectTitle.equals(this.ProjectTitle) &&pro.projectId==this.projectId)
           return  true;
        else 
           return false;
    }
    
}
