package Strings;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("It is Palindrome.");
        }else{
            System.out.println("It is NOT a Palindrome.");
        }
    }
}
