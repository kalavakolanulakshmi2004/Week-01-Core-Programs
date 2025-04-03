import java.util.Scanner;
public class Area{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter base:");
		double base=input.nextDouble();
		System.out.println("Enter height:");
		double height=input.nextDouble();
		double totalinches=height/2.54;
		double feet =(totalinches/12);
		double areaincm = 0.5 * base * height;
		double areaininches=0.5*totalinches*feet;
		System.out.println("Your Height in cm is "+height+" Area in cm is " + String.format("%.2f",areaincm)+" and Area in inches is "+ String.format("%.2f",areaininches));
		input.close();
	}
}