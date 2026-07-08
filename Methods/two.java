class computer
{
    public void PlayMusic()
    {
        System.out.println("Playing Music....");
    }
    public String GetMeAPen(int cost)
    {
        if(cost>=10)
        {
            return "Pen";
        }
        else
        {
            return "Nothing..";
        }
    }
}

public class two extends computer
{
    public static void main(String[] args)
    {
        computer obj = new computer();
        obj.PlayMusic();
        String s = obj.GetMeAPen(5);
        System.out.println(s);
    }
}