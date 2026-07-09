class Student
{
    private String Name;
    private int Age;
    private int Marks;

    public Student()
    {
        Name = "Kumar";
        Age = 35;
        Marks = 98;
    }

    public Student(String n,int a,int m)
    {
        Name = n;
        Age = a;
        Marks = m;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public int getMarks() {
        return Marks;
    }
    public void setMarks(int Marks) {
        this.Marks = Marks;
    }
}

public class one
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        Student obj1 = new Student("Vinay",21,45);

        System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getMarks());
        System.out.println(obj1.getName() + " : " + obj1.getAge() + " : " + obj1.getMarks());
    }
}