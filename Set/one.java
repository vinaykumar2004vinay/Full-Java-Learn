
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class one
{
    public static void main(String args[])
    {
        Set<Integer> num = new HashSet<Integer>();
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