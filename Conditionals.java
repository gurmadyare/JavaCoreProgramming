import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //1
        //dayoftheWeek((byte) 9);
        //2
        //BMICalc(1.70, 60);
        //System.out.println(isPrime(9) ? "The number is prime": "The number is not a prime number!");
        //basicCalc(10, 'x', 10);
        System.out.println(isPalindrome()
                ? "The input text is Palindrome"
                : "The input text is not a Palindrome!"
        );
    }

    //Conditional problems

    //1) Day of the week
    private static void dayoftheWeek(byte dayNo){
        switch (dayNo){
            case 1:
                System.out.println("Saturday!");
                break;
            case 2:
                System.out.println("Sunday!");
                break;
            case 3:
                System.out.println("Monday!");
                break;
            case 4:
                System.out.println("Tuesday!");
            case 5:
                System.out.println("Wednesday!");
                break;
            case 6:
                System.out.println("Thursday!");
            case 7:
                System.out.println("Friday!, holiday");
                break;
            default:
                System.out.println("Please enter the numbers b/w 1-7");
        }
    }

    //Problem2: BMI calculator
    private static void BMICalc(double height, double weight){
       try{
           double BMI = weight / (height * height);

           if(BMI < 18.5){
               System.out.println("Underweight, Eat more!");
           }else if(BMI >= 18.5 && BMI <= 24.9){
               System.out.println("Normal weight!");
           }else if(BMI >= 25 && BMI <= 29.9){
               System.out.println("Overweight, Exercise!");
           }else {
               System.out.println("Obese, Butacow baano oolyo!");
           }
       }catch (Exception e){
           System.out.println(e);
           System.out.println("Please enter a number only!");
       }
    }

    //Problem3: Prime number checker

    private static boolean isPrime(int n){
        if(n <= 1){
            return  false;
        }

        //For numbers > 1, we check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        //else
        return true;
    }

    //Problem4: Simple calculator
    private static void basicCalc(double n1, char sign, double n2){

        try {
            double total = 0;
            switch (sign){
                case '+':
                    total = n1 + n2;
                    break;

                case '-':
                    total = n1-n2;
                    break;

                case '*', 'x', 'X':
                    total = n1 * n2;
                    break;

                case '/':
                    total = n1 / n2;

                default:
                    System.out.println("Invalid input!, Please try again");

            }

            //display
            System.out.println("Input number1: " + n1);
            System.out.println("Input number2: " + n2);
            System.out.println("Total: " + total);


        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static boolean isPalindrome(){
        //1) First, get an input
        System.out.print("Enter a text: ");
        Scanner input = new Scanner(System.in);

        //2) Store and remove all spaces & convert it to lower ase
        String text = input.nextLine().replaceAll(" ", "").toLowerCase();

        //3) Initialize pointers
        int left = 0;
        int right = text.length() -1;

        //4) Check Palindrome
        while (left < right){
            if(text.charAt(left) != text.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
