class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}

class B extends A
{
    @Override
    public void show()
    {
        System.out.println("In B Show");
    }
}

public class one
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
    }
}