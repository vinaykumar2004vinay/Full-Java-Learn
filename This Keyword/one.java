class Student
{
    private String Name = "Vinay";
    private int Age = 21;
    private int Marks = 85;

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
        obj.setName("Vinay");
        obj.setAge(21);
        obj.setMarks(50);

        System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getMarks());
    }
}