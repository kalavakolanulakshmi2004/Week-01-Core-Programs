import java.util.Scanner;
public class Travel{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your  name: ");
		String name = input.nextLine();
		System.out.print("Enter from city: ");
		String fromcity = input.nextLine();
		System.out.print("Enter via city: ");
		String viacity = input.nextLine();
		System.out.print("Enter to city: ");
		String tocity = input.nextLine();
		System.out.print("Enter distance from city to via city: ");
		double distancefromtovia = input.nextDouble();
		System.out.print("Enter time taken to travel from city to via city in minutes: ");
		int timefromtovia = input.nextInt();
		System.out.print("Enter distance via city to from city: ");
		double distanceviatofinal= input.nextDouble();
		System.out.print("Enter time taken to travel via city to from city in minutes: ");
		int timeviatofinal = input.nextInt();
		double totalDistance = distancefromtovia + distanceviatofinal;
		int totalTime = timefromtovia + timeviatofinal;
		System.out.println("The Total Distance travelled by " + name + " from " + fromcity + " to " + tocity + " via " + viacity +" is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");
   }
}
