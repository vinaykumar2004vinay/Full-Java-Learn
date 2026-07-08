class students
{
    int rollno;
    String name;
    int marks;
}

public class one
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

        System.out.println(obj1.rollno + " - " + obj1.name + " - " + obj1.marks);
        System.out.println(obj2.rollno + " - " + obj2.name + " - " + obj2.marks);
        System.out.println(obj3.rollno + " - " + obj3.name + " - " + obj3.marks);
    }
}