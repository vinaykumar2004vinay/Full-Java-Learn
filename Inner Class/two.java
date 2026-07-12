class A
{
    int Age;

    public void show()
    {
        System.out.println("In A Show");
    }

    static class B
    {
        public void config()
        {
            System.out.println("In B Config");
        }
    }
}

class two
{
    public static void main(String[] args)
    {
        A.B obj1 = new A.B();
        obj1.config();
    }
}