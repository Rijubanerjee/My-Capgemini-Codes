package Assignments.P1;

public class Stock {
	private String stockName; // infosys
	private float stockPrice;  // 1300
	
	public String getStockName() {
		return stockName;
	}
	
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	

	public float getStockPrice() {
		return stockPrice;
	}

	public Stock(String name, int price) {
		stockName = name;
		stockPrice = price;
	}
	
	public void changePrice(float percentageChange,boolean action)
	{
		
		float newprice = (float) (this.stockPrice * (percentageChange / 100));
		if (action)
			this.stockPrice = this.stockPrice + newprice;
		else 
			this.stockPrice = this.stockPrice - newprice;
		
	}
	
}
