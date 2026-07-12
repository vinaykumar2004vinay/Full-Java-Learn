class laptop
{
    public void code()
    {
        System.out.println("Code , Compile , Run");
    }
}

class developer extends laptop
{
    public void dev(laptop lap)
    {
        lap.code();
    }
}

public class two
{
    public static void main(String[] args)
    {
        laptop lap = new laptop();
        
        developer obj = new developer();
        obj.dev(lap);
    }
}