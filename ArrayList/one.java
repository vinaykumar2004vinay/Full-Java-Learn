import java.util.ArrayList;
import java.util.Collection;

class one
{
    public static void main(String args[])
    {
        Collection<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(4);
        num.add(3);
        num.add(9);

        for(int n : num)
        {
            System.out.println(n);
        }
    }
}