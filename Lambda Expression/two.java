interface A
{
    int add(int i,int j);
}

class two
{
    public static void main(String[] args)
    {
        A obj = (i,j) -> i+j;
        int r = obj.add(2,3);
        System.out.println(r);
    }
}