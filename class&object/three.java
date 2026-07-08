class calc
{
    public int add(int x,int y)
    {
        int r = x+y;
        return r;
    }
}

public class three extends calc
{
    public static void main(String[] args)
    {
        calc obj = new calc();
        int z = obj.add(5,2);
        System.out.println(z);
    }
}