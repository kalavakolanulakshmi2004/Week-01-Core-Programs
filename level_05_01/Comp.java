package level1;
import java.util.*;
public class Comp {
    public static boolean compareStrings(String s1,String s2){
        if(s1.length()!=s2.length()) {
            return false;
        }
        for(int i=0;i<s1.length();i++)
            if(s1.charAt(i)!=s2.charAt(i)) {
                return false;
            }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter str1: ");
        String str1=sc.next();
        System.out.print("Enter str2: ");
        String str2=sc.next();
        boolean charAtComparison=compareStrings(str1,str2);
        boolean equalsComparison=str1.equals(str2);
        System.out.println("charAt method result: "+charAtComparison);
        System.out.println("equals() method result: "+equalsComparison);
        System.out.println("Results match: "+(charAtComparison==equalsComparison));
    }
}
