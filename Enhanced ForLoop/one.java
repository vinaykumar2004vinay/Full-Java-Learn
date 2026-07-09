class student
{
    int Rollno;
    String Name;
    int Marks;
}

public class one
{
    public static void main(String[] args)
    {
        student obj1 = new student();
        obj1.Rollno = 1;
        obj1.Name = "Dasari";
        obj1.Marks = 25;

        student obj2 = new student();
        obj2.Rollno = 2;
        obj2.Name = "Vinay";
        obj2.Marks = 35;

        student obj3 = new student();
        obj3.Rollno = 3;
        obj3.Name = "Kumar";
        obj3.Marks = 55;

        student students[] = new student[3];
        students[0] = obj1;
        students[1] = obj2;
        students[2] = obj3;

        for(student stud : students)
        {
            System.out.println(stud.Name + " - " + stud.Marks);
        }
    }
}