import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
         // calcFactorial(5);
        // fibonacciSeries(10);
       // DiamondPattern(5);
        guessTheNo();
    }

    //Problems

    //1) Factorial calculation
    private static void calcFactorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }

        System.out.println("factorial: " + n + "! = " + result);
    }

    //2) Fibonacci series
    private static void fibonacciSeries(int n){
        //Create a list to store the fibonacci series
        int[] fibonacciSeries = new int[n];
        //set the first two elements to 0 and 1
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        //Use loop to calculate the others
        for(int i = 2; i < n; i++){
            fibonacciSeries[i] = fibonacciSeries[i-2] + fibonacciSeries[i-1];
        }

        //finally display
        int middleEl = fibonacciSeries[fibonacciSeries.length / 2];
        System.out.println("Fibonacci series: " + Arrays.toString(fibonacciSeries));
        System.out.println("Middle element: " + middleEl);

    }

    //3) Diamond pattern
    private static void DiamondPattern(int rows){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows -i -1; j++){
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i +1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    //3) Guess the number
    private static void guessTheNo(){
        //Welcome
        System.out.println("Welcome to guess the number game!" + "\n");
        //generate a random number b/w 1-100
        Random random = new Random();
        int randomNo = random.nextInt(100);

        //limit
        int attempts = 5;

        //Ask the user to guess the no and keep
        //prompting until the user guesses using do-while
        int userGuess;
        do {
            System.out.print("Guess your guess(1-100): ");
            Scanner sc = new Scanner(System.in);
            userGuess = sc.nextInt();

            //some motivations
            if(userGuess < (randomNo/2)){
                System.out.println("Too low!, try again" + "\n");
            }else if(userGuess > (randomNo/2) && userGuess < randomNo){
                System.out.println("You're close!, try again"  + "\n");
            }else if(userGuess > randomNo){
                System.out.println("Too high!, try again"  + "\n");
            }else {
                System.out.println("Congratulations!, you guessed the no in " + attempts + " attempt.");
                
                break;
            }

            attempts--;

            if(attempts < 1 && userGuess != randomNo){
                System.out.println("Sorry!, you have reached the limit. Please retry the application again");
            }
        }while (userGuess != randomNo && attempts >= 1);
    }
}
