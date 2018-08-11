import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xzinoviou
 *
 */
public class PalindromeString {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);


        StringBuilder sb = new StringBuilder();


        System.out.println("Palindrome String program");


        while(true) {

            sb.setLength(0);

            System.out.println("\nEnter your string : ");

            sb.append(sc.nextLine());


            String regex = "^[a-zA-Z]+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sb.toString());


            if(matcher.matches()){
                int i = 0;
                int j = sb.length() - 1;
                System.out.println("Length of input : " + sb.length());

                if (isPalindrome(sb.toString()))
                    System.out.println("Success! Your String is Palindrome!");

                else
                    System.out.println("The String you have entered is not Palindrome..");

            } else{
                System.out.println("Please use only letters");
            }


        }

    }

    public static boolean isPalindrome(String string){

        int i=0;
        int j = string.length()-1;

        while(string.charAt(i)==string.charAt(j)){

            if(i==j-1 || i==j)
                return true;

            i++;
            j--;

        }

        return false;

        }

}
