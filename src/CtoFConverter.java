import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        double tempC, tempF;
        System.out.println("What is the temperature in Celsius?");
        Scanner input = new Scanner(System.in);
        tempC = input.nextDouble();
        if (tempC < -273.15)
            System.out.println("Invalid input; please input something greater than -273.15 Celsius");
        else if (tempC == 100)
            System.out.println("That is the boiling point of water and is 212 degrees Fahrenheit");
        else if (tempC == 0)
            System.out.println("That is the freezing point of water and is 32 degrees Fahrenheit");
        else
        {
            tempF = tempC * 1.8 + 32;
            System.out.println("The temperature in Fahrenheit is " + tempF);
        }
    }
}
