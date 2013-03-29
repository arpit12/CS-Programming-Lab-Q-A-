class CheckDemo
{
    private int date;
    public void validate(int d1)
    {
       if( d1 > 0 && d1 < 32)
       {
           date = d1;
           System.out.println("Yes, your birth date is " + date + " and is valid");
       }
       else
       {
           System.out.println("Sorry, your birth date is " + d1 + " and is invalid");
       }
   }
}
public class CheckDateDemo
{
       public static void main(String args[])
       {             
           CheckDemo cd1 = new CheckDemo();
           cd1.validate(15);
           cd1.validate(35);
       }
}