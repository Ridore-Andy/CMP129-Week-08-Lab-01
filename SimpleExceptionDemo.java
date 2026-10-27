import java.util.InputMismatchException;
import java.util.Scanner;
public class SimpleExceptionDemo 
{
    public static void main(String[] args) 
    {
        try 
        {
            //scanner to input both a numerator and denominator
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a numerator and denominator:");
            int numerator = keyboard.nextInt();
            int denominator = keyboard.nextInt();
            safeDivide(numerator,denominator);
            keyboard.close();
        } 
        //catches if denominator is 0
        catch( ArithmeticException e) 
        {System.out.println("Cannot divide by 0.");}

        //catches inputs that are not intergers
        catch(InputMismatchException e)
        {System.out.println("Enter an interger.");}

        finally
        {System.out.println("Division Complete");}
    }
    //method for division
    public static void safeDivide(int numerator, int denominator)
    {
        int sum = numerator/denominator;
        System.out.println(sum);
    }
}
