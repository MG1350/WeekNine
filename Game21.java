import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Game21
{
    public static void main (String args [])
    {
        int cNum1 = (int) (10*Math.random()+1);
        int cNum2 = (int) (10*Math.random()+1);
        int cNum3 = (int) (10*Math.random()+1);
        int Num1 = (int) (10*Math.random()+1);
        int Num2 = (int) (10*Math.random()+1);
        int Num3 = (int) (10*Math.random()+1);
        int cTotal = 0;
        int Total = Num1 + Num2;
        int hold;
        System.out.println("You have a "+ Num1 + " and " + Num2 + " for a total of " + Total);
        Scanner input = new Scanner(System.in);
        System.out.println("enter a 1 if you want another card OR any other number for no card");
        hold = input.nextInt();
        input.close();
        if (hold == 1)
        {
            Total += Num3;
            System.out.println("You got a "+ Num3 + " for a total of " + Total);
            cTotal = cNum1 + cNum2 + cNum3;
            System.out.println("The dealer has a "+ cNum1 + " and " + cNum2 + " and " + cNum3 + " for a total of " + cTotal);
        } else
        {
            cTotal = cNum1 + cNum2 + cNum3;
            System.out.println("The dealer has a "+ cNum1 + " and " + cNum2 + " and " + cNum3 + " for a total of " + cTotal);
        }
        if (Total > 21)
        {
            System.out.println("Player loses!");
        } else if((cTotal > 21) && (Total <= 21))
        {
            System.out.println("Player wins!");
        } else if(Total > cTotal)
        {
            System.out.println("Player wins!");
        } else
        {
            System.out.println("Player loses!");
        }
    }
}