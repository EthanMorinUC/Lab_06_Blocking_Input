import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        double fuelCapacity = 0, numGallons = 0, fuelEfficiency = 0, pricePerGallon = 0;
        Boolean validInput = false;
        do {
            System.out.print("What is the fuel capacity of the car in gallons?");
            Scanner in = new Scanner(System.in);

            if (in.hasNextDouble()) {
                fuelCapacity = in.nextDouble();
                validInput = true;
            }
        }while (validInput == false);
        validInput = false;

        do {
            System.out.print("How many gallons of gas are in the gas tank?");
            Scanner in = new Scanner(System.in);

            if (in.hasNextDouble()) {
                numGallons = in.nextDouble();
                validInput = true;
            }
        }while (validInput == false);
        validInput = false;

        do {
            System.out.print("What is the fuel efficiency in miles per gallon (mpg)?");
            Scanner input = new Scanner(System.in);

            if (input.hasNextDouble()){
                fuelEfficiency = input.nextDouble();
                validInput = true;
            }
        }while (validInput == false);
        validInput = false;

        do {
            System.out.print("What is the price of the fuel per gallon (in dollars)?");
            Scanner in = new Scanner(System.in);

            if (in.hasNextDouble()){
                pricePerGallon = in.nextDouble();
                validInput = true;
            }
        }while (validInput == false);
        validInput = false;

        double costHundredMiles = (100 / fuelEfficiency) * pricePerGallon;
        double maxDistance = fuelCapacity * fuelEfficiency;
        System.out.println("The cost for gas to go 100 miles will be $" + costHundredMiles );
        System.out.println("The maximum distance with a full tank is " + maxDistance + " miles");
    }
}
