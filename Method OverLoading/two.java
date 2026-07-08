class calculator
{
    public int add1(int x,int y)
    {
        return x+y;
    }
    public int add2(int x,int y,int z)
    {
        return x+y+z;
    }
}

public class two
{
    public static void main(String[] args)
    {
        calculator obj1 = new calculator();
        int r1 = obj1.add1(2,3);
        System.out.println(r1);

        calculator obj2 = new calculator();
        int r2 = obj2.add2(2,3,5);
        System.out.println(r2);
    }
}