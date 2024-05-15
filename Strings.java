import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        //System.out.println("String Length: " + findLength("Jama Guled Osman"));
        //System.out.println("No of occurrences: " + countOccurrences("Gurmad", 'a'));
        //System.out.println("Reversed String: " + reverseString("Gurmad Harir"));
        //System.out.println("Are they anagrams: " + AreAnagrams("Gurmad", "damruG"));
        removeWhiteSpaces("Gurmad Harir Abdulle");
    }

    //String Exercises

    //1) Find the length of the string
    private static int findLength(String str){
        return str.length();
    }

    //2) Count the no of occurrences of a specific char in a string.
    private static int countOccurrences(String str, char targetChar){
        //initialize a varibale count to store the count of occurrences
        int count = 0;

        for(int i = 0; i < str.length()-1; i++){
            //Foreach char check if the char matches the targetChar
            if(str.charAt(i) == targetChar){
                count++;
            }
        }

        return  count;

    }

    //3) Reverse a string without built in method
    private static StringBuilder reverseString(String str){
        //create reversedString variable to store the reversed string
        StringBuilder reversedString = new StringBuilder();

        //Loop through each char in reverse and initialize to it
        for(int i = str.length()-1; i >= 0; i--){
            reversedString.append(str.charAt(i));
        }

        return  reversedString;
    }

    //4) Check if the two string are anagrams of each other
    //   (anagrams are formed of rearranging the letters e.g -> silent , listen)

    private static boolean AreAnagrams(String str1, String str2){
        //Step1: Remove any whitespaces and convert both to lowercase
        str1 = str1.replace("\\s", "").toLowerCase();
        str2 = str2.replace("\\s", "").toLowerCase();

        //Step2: if the lengths of the two strings aren't equal, they cannot be anagrams
        if(str1.length() != str2.length()) return  false;

        //Step3: Convert both string to char array
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        //Step4: Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        //Step5: Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }

    //5) Remove all white spaces from a string without built in method
    private static void removeWhiteSpaces(String str){
        StringBuilder noSpaceString = new StringBuilder();
        
        //use loop
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                noSpaceString.append(str.charAt(i));
            }
        }

        //finally display it to the user
        System.out.println("Before removing whitespaces: " + str);
        System.out.println("After removing whitespaces: " + noSpaceString);
    }




}
