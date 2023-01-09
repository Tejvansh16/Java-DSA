
public class BestTimeToBuyAndSellStock {

	static void maxProfit(int [] prices) {
		int buy = prices[0], max_profit = 0;
	    for (int i = 1; i < prices.length; i++) {
	 
	      // Checking for lower buy value
	      if (buy > prices[i])
	        buy = prices[i];
	 
	      // Checking for higher profit9
	      else if (prices[i] - buy > max_profit)
	        max_profit = prices[i] - buy;
	    }
		System.out.println("the best price to buy is "+buy+" and the best price to sell is "+(max_profit+buy));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []prices= {7,1,5,3,6,4};
		maxProfit(prices);
	}

}
