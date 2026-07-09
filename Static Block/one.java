class Mobile
{
    String Brand;
    int Price;
    static String Name;

    static
    {
        String Name = "Phone";
        System.out.println("In Static Block");
    }

    public Mobile()
    {
        String Brand = "";
        int Price = 200;
        System.out.println("In Constructer");
    }

    public void show()
    {
        System.out.println(Brand + " - " + Price + " - " + Name);
    }
}

public class one
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.Brand = "Samsung";
        obj1.Price = 1000;
        Mobile.Name = "Smartphone";

        Mobile obj2 = new Mobile();
    }
}