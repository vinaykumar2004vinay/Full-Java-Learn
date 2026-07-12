class A
{
    int Age;

    public void show()
    {
        System.out.println("In A Show");
    }

    class B
    {
        public void config()
        {
            System.out.println("In B Config");
        }
    }
}

class one
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();
    }
}