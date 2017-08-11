package dp;

/**
 * Created by Administrator on 2016/6/20 0020.
 */
public class BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        if(prices.length < 2)
            return 0;
        int max = 0;
        int minStockPrice = prices[0];
        for(int i = 1; i < prices.length; ++i) {
            if(prices[i] - minStockPrice > max) {
                max = prices[i] - minStockPrice;
            }
            if(prices[i] < minStockPrice){
                minStockPrice = prices[i];
            }
        }
        return max;

    }
}
