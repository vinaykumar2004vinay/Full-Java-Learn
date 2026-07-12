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

public class two
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
        obj.add(2,3);
    }
}