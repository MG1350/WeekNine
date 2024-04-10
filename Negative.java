// Maverick Guinto 4/10
public class Negative 
{
    public static void main (String args [])
    {
        int num;
        int total = 0;
        for (int i = 0; i < 4; i++)
        {
            num = (int) (8*Math.random()-4);
            total += num;
            System.out.println("Num " + (i+1) + ": " + num);
        }
        System.out.println("Total: " + total);
        if(total > 0 || total == 0)
        {
            System.out.println("Not Negative");
        } else
        {
            System.out.println("Negative");
        }
    }
    

}
