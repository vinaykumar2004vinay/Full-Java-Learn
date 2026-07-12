abstract class car
{
    public abstract void drive();

    public void PlayMusic()
    {
        System.out.println("Playing....");
    }
}

class BMW extends car
{
    public void drive()
    {
        System.out.println("Driving...");
    }
}

class one
{
    public static void main(String[] args)
    {
        car obj = new BMW();
        obj.drive();
        obj.PlayMusic();
    }
}