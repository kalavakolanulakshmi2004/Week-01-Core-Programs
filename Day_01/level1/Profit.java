public class Profit{
	public static void main(String[] args){
		int costprice=129;
		int sellingprice=191;
		int profit= sellingprice-costprice;
		double profitpercentage = ((double)profit / costprice) * 100;
		System.out.println("The Cost Price is INR "+costprice+" and Selling Price is INR " + sellingprice + "\nThe Profit is INR " +profit+" and the Profit Percentage is "+String.format("%.2f",profitpercentage));
	}
}