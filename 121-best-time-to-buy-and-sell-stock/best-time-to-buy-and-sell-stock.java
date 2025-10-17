class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int buy_price = prices[0];
        for(int i=1; i<prices.length; i++){
            int curr_profit = prices[i] - buy_price;
            if(curr_profit > max_profit){
                max_profit = curr_profit;
            }
            if(prices[i] < buy_price){
                buy_price = prices[i];

            }
        }
        return max_profit;
    }
}