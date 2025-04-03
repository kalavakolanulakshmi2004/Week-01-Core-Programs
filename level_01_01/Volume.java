public class Volume{
	public static void main(String[] args){
		int radius=6378;
		double pi=3.14;
		double volumeofSphereinkm = (4.0/3.0) * pi * Math.pow(radius,3) ;
		double volumeofSphereinmiles = volumeofSphereinkm * 0.239335; //1km = 0.621371 and (1km)^3 = (0.621371 miles)^3 == 0.239335
		System.out.println("The volume of earth in cubic kilometers is "+String.format("%.2f",volumeofSphereinkm)+" and cubic miles is " + String.format("%.2f",volumeofSphereinmiles));
	}
}