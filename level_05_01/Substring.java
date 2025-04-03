package level1;
import java.util.*;
public class Substring {
    public static String createSubstring(String s,int start,int end){
        char[] sub=new char[end-start];
        for(int i=start;i<end;i++)
            sub[i-start]=s.charAt(i);
        return new String(sub);
    }
    public static boolean compareStrings(String s1,String s2){
        return s1.equals(s2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=sc.next();
        System.out.print("Enter start: ");
        int start=sc.nextInt();
        System.out.print("Enter end: ");
        int end=sc.nextInt();
        String charAtSubstring=createSubstring(str,start,end);
        String builtInSubstring=str.substring(start,end);
        boolean comparison=compareStrings(charAtSubstring,builtInSubstring);
        System.out.println("charAt method substring: "+charAtSubstring);
        System.out.println("substring() method result: "+builtInSubstring);
        System.out.println("Results match: "+comparison);
    }
}
