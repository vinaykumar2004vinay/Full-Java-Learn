class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
    public void config()
    {
        System.out.println("In A Config");
    }
}

class B extends A
{
    public void show1()
    {
        System.out.println("In B Show");
    }
    public void config1()
    {
        System.out.println("In B Config");
    }
}

public class one
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show1();
        obj.config1();
    }
}