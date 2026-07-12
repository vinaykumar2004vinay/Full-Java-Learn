class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}
public class two
{
    public static void main(String[] args)
    {
        A obj = new B();
        obj.show();
    }
}