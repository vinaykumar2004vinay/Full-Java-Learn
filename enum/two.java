enum Status
{
    Running,Pending,Failed,Finished
}

public class two
{
    public static void main(String[] args)
    {
        Status s  = Status.Finished;

        if(s == Status.Running)
            System.out.println("All Good");
        else if(s == Status.Pending)
            System.out.println("Not Good");
        else if(s == Status.Failed)
            System.out.println("Rejected");
        else if(s == Status.Finished)
            System.out.println("Completed");
    }
}