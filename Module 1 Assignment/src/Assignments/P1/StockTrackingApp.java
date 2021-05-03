package Assignments.P1;

public class StockTrackingApp {
	public static void main(String[] args) {
		Stock test1 = new Stock ("ATrader" , 1200);
		System.out.println(test1.getStockPrice());
		// display the price .
		
		System.out.println(test1.getStockName()+test1.getStockPrice());
		// call price change method 
		
		test1.changePrice(4, true);
		test1.setStockName("Capgemini");
		
		// display the stock details again
		System.out.println(test1.getStockName()+test1.getStockPrice());
	}
}
