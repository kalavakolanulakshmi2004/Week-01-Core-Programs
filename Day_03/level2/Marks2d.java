import java.util.Scanner;
public class Marks2d{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no.of students:");
		int num=input.nextInt();
		int[][] mark = new int[num][3];
		double[] percentage = new double[num];
		String[] grade = new String[num];
		for(int i=0;i<num;i++){
			System.out.println("Enter marks of student " + (i+1)+": ");
			System.out.print("Physics:");
			mark[i][0] = input.nextInt();
			if(mark[i][0]<0){
				System.out.println("Invalid number! Enter a positive number for physics: ");
				mark[i][0] = input.nextInt();
			}
			System.out.print("Chemistry:");
			mark[i][1] = input.nextInt();
			if(mark[i][1]<0){
				System.out.println("Invalid number! Enter a positive number for chemistry: ");
				mark[i][1] = input.nextInt();
			}
			System.out.print("Maths:");
			mark[i][2] = input.nextInt();
			if(mark[i][2]<0){
				System.out.println("Invalid number! Enter a positive number for maths: ");
				mark[i][2] = input.nextInt();
			}
			int totalMarks = mark[i][0]+ mark[i][1] + mark[i][2] ;
			percentage[i] = (double) totalMarks/3;
			if(percentage[i] >=80){
				grade[i] = "A";
			}
			else if(percentage[i] >=70 && percentage[i] <= 79){
				grade[i] = "B";
			}
			else if(percentage[i] >=60 && percentage[i] <= 69){
				grade[i] = "C";
			}
			else if(percentage[i] >=50 && percentage[i] <= 59){
				grade[i] = "D";
			}
			else if(percentage[i] >=40 && percentage[i] <= 49){
				grade[i] = "E";
			}
			else{
				grade[i] = "R";
			}
		}
		System.out.println("Student results:");
		System.out.println("Physics Chemistry  Maths  Percentage Grade");
		for(int i=0;i<num;i++){
			System.out.println(mark[i][0]+"\t "+mark[i][1]+"  \t"+mark[i][2]+"  \t"+String.format("%.2f",percentage[i])+" \t\t"+grade[i]);
		}
	}
}