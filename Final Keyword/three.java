class A
{
    final public void show()
    {
        System.out.println("In A Show");
    }
    public void add(int a , int b)
    {
        System.out.println(a+b);
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("In B Show");
    }
}

public class three
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
        obj.add(2,3);
    }
}