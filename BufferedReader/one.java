import java.io.IOException;

class one
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter a Number");
        int r = System.in.read();
        System.out.println(r-48);
    }
}