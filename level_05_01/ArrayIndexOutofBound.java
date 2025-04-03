package level1;
import java.util.*;
public class ArrayIndexOutofBound {
    public static void generateException(String[] names, int index) {
        System.out.println("Accessing element: " + names[index]);
    }
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Accessing element: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid index " + index + " - " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        String[] names = new String[index];
        for(int i=0;i<index;i++){
            System.out.println("Enter names "+ (i+1) +": ");
            names[i]=scanner.next();
        }
        handleException(names, index);

    }
}
