import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        double width = 0, height = 0;
        Boolean validInput = false;

        do {
            System.out.print("What is the width of the rectangle?");
            Scanner in = new Scanner(System.in);

            if (in.hasNextDouble()){
                width = in.nextDouble();
                validInput = true;
            }
        }while (validInput == false);
        validInput = false;

        do {
            System.out.print("What is the height of the rectangle?");
            Scanner in = new Scanner(System.in);

            if (in.hasNextDouble()){
                height = in.nextDouble();
                validInput = true;
            }
        }while (validInput == false);

        System.out.println("The area of the rectangle is " + (width * height));
        System.out.println("The perimeter of the rectangle is " + ((height * 2) + (width * 2)));
        System.out.println("The length of the diagonal is " + Math.sqrt(((width*width) + (height*height))));
    }
}
