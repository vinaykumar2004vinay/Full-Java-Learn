interface A
{
    void show();
}
class one 
{
    public static void main(String[] args)
    {
        A obj = () -> System.out.println("In Show");
        obj.show();
    }
}