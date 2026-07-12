abstract class car
{
    public abstract void drive();
    public abstract void fly();

    public void PlayMusic()
    {
        System.out.println("Playing....");
    }
}

abstract class BMW extends car
{
    public void drive()
    {
        System.out.println("Driving...");
    }
}

class NEWBMW extends BMW
{
    public void fly()
    {
        System.out.println("Flying...");
    }
}

class two
{
    public static void main(String[] args)
    {
        car obj = new NEWBMW();
        obj.drive();
        obj.PlayMusic();
        obj.fly();
    }
}