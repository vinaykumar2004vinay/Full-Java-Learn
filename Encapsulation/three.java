class Student
{
    private String Name = "Vinay";
    private int Age = 21;
    private int Marks = 85;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public int getMarks() {
        return Marks;
    }
    public void setMarks(int marks) {
        Marks = marks;
    }
}

public class three
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.setName("Vinay");
        obj.setAge(21);
        obj.setMarks(50);

        System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getMarks());
    }
}