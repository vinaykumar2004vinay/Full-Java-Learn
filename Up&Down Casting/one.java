class A
{
    public void show1()
    {
        System.out.println("In A Show");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("In B Show");
    }
}

public class one
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show1();
    }
}