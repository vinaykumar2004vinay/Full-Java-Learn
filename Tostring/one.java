class Laptop
{
    String Model;
    int Price;
}

public class one
{
    public static void main(String[] args)
    {
        Laptop obj = new Laptop();
        obj.Model = "Lenovo";
        obj.Price = 10000;

        System.out.println(obj.toString());
    }
}