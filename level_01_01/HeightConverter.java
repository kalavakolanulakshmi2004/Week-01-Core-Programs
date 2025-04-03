import java.util.Scanner;
public class HeightConverter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your height:");
		double heightcm=input.nextDouble();
		double totalinches=heightcm/2.54;
		double feet =(totalinches/12);
		System.out.println("Your Height in cm is "+heightcm+" while in feet is " + String.format("%.2f",feet)+" and inches is "+ String.format("%.2f",totalinches));
		input.close();
	}
}