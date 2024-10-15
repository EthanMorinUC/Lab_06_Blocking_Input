import java.util.*;

public class HighOrLow
{
    public static void main(String[] args)
    {
        int randomNum = (int)(Math.random() * 10);
        int guess = 0;
        do {
            System.out.println("Guess the number between 1 and 10:");
            Scanner input = new Scanner(System.in);

            if (input.hasNextInt()){
                guess = input.nextInt();
                if (guess < randomNum){
                    System.out.println("Guess Higher");
                }
                else if (guess > randomNum){
                    System.out.println("Guess Lower");
                }
                else
                    System.out.println("Nice guess!");
            }
        }while (guess != randomNum);
    }
}