import java.util.Scanner;
public class FriendsComp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = input.nextInt();
        String youngestFriend;
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            youngestFriend = "Amar";
        } else if (akbarAge < anthonyAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        int tallestHeight;
        String tallestFriend;
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            tallestHeight = amarHeight;
            tallestFriend = "Amar";
        } else if (akbarHeight > anthonyHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        } else {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
    }
}
