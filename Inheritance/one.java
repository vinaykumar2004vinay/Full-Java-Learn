public class one
{
    public static void main(String[] args)
    {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(2,3);
        int r2 = obj.sub(2,3);
        int r3 = obj.multi(2,3);
        int r4 = obj.div(2,3);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}