class one
{
    public static void main(String[] args)
    {
        int num[][] = new int[3][4];
        num[0][0] = 5;
        num[2][3] = 9;
        num[1][2] = 2;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}