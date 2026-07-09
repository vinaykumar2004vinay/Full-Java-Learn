class Mobile
{
    String Brand;
    int Price;
    static String Name;

    public void show()
    {
        System.out.println(Brand + " - " + Price + " - " + Name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.Brand + " - " + obj.Price + " - " + Name);
    }
}

public class two
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.Brand = "Samsung";
        obj1.Price = 1000;
        Mobile.Name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.Brand = "Apple";
        obj2.Price = 15458;
        Mobile.Name = "Smartphone";

        Mobile obj3 = new Mobile();
        obj3.Brand = "Vivo";
        obj3.Price = 1235;
        Mobile.Name = "Smartphone";

        obj1.Name = "Mobile";

        obj1.show();
        obj2.show();
        obj3.show();

        Mobile.show1(obj1);
    }
}