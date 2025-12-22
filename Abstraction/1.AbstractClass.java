abstract class University
{
    abstract  void resultPublish();
    public void status()
    {
        System.out.println("RESULTS ARE PUBLISHED SUCCESSFULLY TO THE COLLEGES");
    }
}
class College extends University
{
    public void resultPublish()
    {
        System.err.println("RESULTS ARE PUBLISHED SUCCESSFULLY TO THE STUDENTS");
    }
}
class AbstractClass
{
    public static void main(String[] args)
    {
        University obj =new College();
        obj.resultPublish();
        obj.status();
    }
}