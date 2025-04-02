public class Pens{
	public static void main(String[] args){
		int Pens=14;
		int students=3;
		int eachStudentpen=Pens/students;
		int remainingPens=Pens%students;
		System.out.println("The Pen Per Student is "+eachStudentpen+" and the remaining pen not distributed is " + remainingPens);
	}
}