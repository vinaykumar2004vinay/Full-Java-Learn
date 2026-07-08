class calculator
{
    public int add(int x,int y)
    {
        return x+y;
    }
}

public class one
{
    public static void main(String[] args)
    {
        calculator obj = new calculator();
        int r = obj.add(2,3);
        System.out.println(r);
    }
}