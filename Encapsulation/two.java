class Student
{
    private String Name = "Vinay";
    private int Age = 21;
    private int Marks = 85;

    public String getname()
    {
        return Name;
    }
    public void setname(String s)
    {
        Name = s;
    }

    public int getage()
    {
        return Age;
    }
    public void setage(int a)
    {
        Age = a;
    }

    public int getmarks()
    {
        return Marks;
    }
    public void setmarks(int m)
    {
        Marks = m;
    }
}

public class two
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.setname("Vinay");
        obj.setage(21);
        obj.setmarks(50);

        System.out.println(obj.getname() + " : " + obj.getage() + " : " + obj.getmarks());
    }
}