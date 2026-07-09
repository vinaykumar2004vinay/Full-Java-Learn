class Student
{
    String Name;
    int Age;
    int Marks;
}

public class one
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.Name = "Vinay";
        obj.Age = 21;
        obj.Marks = 50;

        System.out.println(obj.Age);
    }
}