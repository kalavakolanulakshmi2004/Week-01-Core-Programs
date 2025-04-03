import java.util.Scanner;
public class MultArr{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] nums = new double[10];
		double total=0.0;
		int index = 0;
		while(true){
			System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();
			if(number<=0 || index ==10){
			break;
			}
			nums[index] = number;
			index++;
		}
		System.out.println("Numbers entered: ");
		for(int i=0;i<index;i++){
			System.out.print(nums[i] + " ");
			total+=nums[i];
		}
		System.out.println("Total Sum:" + total);
	}
}
       