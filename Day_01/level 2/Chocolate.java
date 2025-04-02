import java.util.Scanner;
public class Chocolate{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number Of chocolates: ");
		int numberofchocolates = input.nextInt();
		System.out.print("Enter number Of Children: ");
		int numberofchildren = input.nextInt();
		int chocolatesPerChild = numberofchocolates / numberofchildren;
        int remainingChocolates = numberofchocolates % numberofchildren;
		System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
	}
}