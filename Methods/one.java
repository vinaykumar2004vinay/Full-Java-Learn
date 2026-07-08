class computer
{
    public void PlayMusic()
    {
        System.out.println("Playing Music....");
    }
    public String GetMeAPen(int cost)
    {
        return "Pen";
    }
}

public class one extends computer
{
    public static void main(String[] args)
    {
        computer obj = new computer();
        obj.PlayMusic();
        String s = obj.GetMeAPen(10);
        System.out.println(s);
    }
}