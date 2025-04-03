package level1;
import java.util.*;
public class UpperCase {
    public static String converttoUpper(String s){
        char[] upper = new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch>='a' && ch<='z') {
                upper[i] = (char) (ch - 32);
            }
            else {
                upper[i] = ch;
            }
        }
        return new String(upper);
    }
    public static boolean comp(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String user = converttoUpper(text);
        String builtIn= text.toUpperCase();
        boolean isEqual = comp(user, builtIn);
        System.out.println("User defined method output:" + user);
        System.out.println("Built-In method output:  "+ builtIn);
        System.out.println("Results match: "+isEqual);
    }
}