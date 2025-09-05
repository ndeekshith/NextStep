package Array;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        
    }
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1){
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices){
            if(price < minPrice){
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}
