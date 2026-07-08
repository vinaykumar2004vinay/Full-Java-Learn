class calc
{
    public int add(int x,int y)
    {
        int r = x + y;
        return r;
    }
    public int sub(int x,int y)
    {
        int r = x - y;
        return r;
    }
    public int multi(int x,int y)
    {
        int r = x * y;
        return r;
    }
    public int div(int x,int y)
    {
        int r = x % y;
        return r;
    }
}

public class two extends calc
{
    public static void main(String[] args)
    {
        calc obj = new calc();
        int result = obj.add(2,3);
        System.out.println(result);
    }
}