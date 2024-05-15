import java.util.Scanner;
import java.util.regex.Pattern;

public class Input_parsing {
    public static void main(String[] args) {
        //problem 1
        //inputValidation();
        //emailValidation("gurmad642@gmail.com");
        numericSummation();
    }

    //Input and Parsing Problems

    //1) user input validation
    private static void inputValidation(){
       try{
           //Ask the user to input a phone number
           System.out.print("Enter your phone number: ");
           Scanner in = new Scanner(System.in);
           //store
           String phNo = in.nextLine();

           //validate
           if(phNo.length() > 14){
               System.out.println("Phone number should not be < or > 12 chars!");
               System.out.println("The phone number should follow this format \"+252 61XXXXXXX\"");
           }else if(phNo.charAt(0) != '+'){
               System.out.println("The first character should be + sign");
           }else if(!phNo.startsWith("252", 1)){
               System.out.println("Phone number should follow this format \"+252\" ");
               System.out.println(phNo.substring(1,4));
           }else if(phNo.charAt(4) != ' '){
               System.out.println("Space is missing b/w the country code and the number");
           }else{
               System.out.println("The format of the number is correct!");
           }
       }catch (Exception e){
           System.out.println(e);
       }
    }

    //problem2: Email validation
    private static void emailValidation(String email){
        //format
        String emailPattern = "^[a-zA-z0-9_]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$";

        if(Pattern.matches(emailPattern, email)){
            System.out.println("The format of the email is correct!");
        }else{
            System.out.println("Invalid format!, Please enter the email in a valid format");
        }
    }

    //Problem3: Numeric input summation
    private static void numericSummation(){
        try{
            //Variable to store the sum
            double total = 0;

            //Ask user to input a number
            System.out.print("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();

            //check if the input is no or not
            while (IsValidNumber(userInput)){
                //userInput to number format
                double no = Double.parseDouble(userInput);
                total += no;

                System.out.print("Enter a number: ");
                Scanner in = new Scanner(System.in);
                userInput = in.nextLine();
            }

            //if the input is not a number, display the result
            System.out.println("A non number input is found, Application is terminated!");

            //Another validation for displaying the total
            String sum = String.valueOf(total);
            if(sum.substring(sum.indexOf('.') +1).equals("0")){
                //If that is the case we display the whole no part only
                System.out.println("Total: " + sum.substring(0, sum.indexOf('.')));
            }else {
                System.out.println("Total: " + total);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }


    //A method to check if the input is a number or not
    private static boolean IsValidNumber(String input){
        try {
            Double.parseDouble(input);
            return true;
        }catch (NumberFormatException e){
            return  false;
        }
    }


}
