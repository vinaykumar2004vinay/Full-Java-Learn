class students
{
    int rollno;
    String name;
    int marks;
}

public class two
{
    public static void main(String[] args)
    {
        students obj1 = new students();
        obj1.rollno = 1;
        obj1.name = "Vinay";
        obj1.marks = 25;

        students obj2 = new students();
        obj2.rollno = 2;
        obj2.name = "Kumar";
        obj2.marks = 50;

        students obj3 = new students();
        obj3.rollno = 3;
        obj3.name = "Dasari";
        obj3.marks = 75;

        students student[] = new students[3];
        student[0] = obj1;
        student[1] = obj2;
        student[2] = obj3;

        for(int i=0;i<student.length;i++)
        {
            System.out.println(student[i].name + " - " + student[i].marks);
        }
    }
}