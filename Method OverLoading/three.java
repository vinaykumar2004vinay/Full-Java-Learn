class calculator
{
    public int add(int x,int y)
    {
        return x+y;
    }
    public int add(int x,int y,int z)
    {
        return x+y+z;
    }
    public double add(double x,int y)
    {
        return x+y;
    }
}

public class three
{
    public static void main(String[] args)
    {
        calculator obj1 = new calculator();
        int r1 = obj1.add(2,3);
        System.out.println(r1);

        calculator obj2 = new calculator();
        int r2 = obj2.add(2,3,5);
        System.out.println(r2);

        calculator obj3 = new calculator();
        double r3 = obj3.add(5.3,2);
        System.out.println(r3);
    }
}