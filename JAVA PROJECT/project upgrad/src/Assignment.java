public class Assignment {
    public static boolean assignProject(Professor prof,Student stud,Project Proj)
    {
        if(stud.ptrProject==null &&stud.ptrProfessor==null)
        {
            for(Student students:prof.studen)
            {
               if(students.studentName==stud.studentName && students.studentid==stud.studentid)
                  return false;
            }            
            stud.ptrProject=Proj;
            stud.ptrProfessor=prof;
            prof.assignStudent(stud);
            return true;            
        }
        else
            return false;
        
    }
}
