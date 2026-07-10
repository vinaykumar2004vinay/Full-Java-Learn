import tools.Calc;
import tools.AdvCalc;

public class one
{
    public static void main(String[] args)
    {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(2,3);
        int r2 = obj.sub(5,3);
        int r3 = obj.multi(2,3);
        int r4 = obj.div(9,3);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}