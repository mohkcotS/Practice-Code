
class Lc_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int maxNum = -1;
        for(int i = prices.length-1; i>= 0;i--){
            while (prices[i] <= maxNum && i != 0){
                i--;
            }
            if(prices[i] > maxNum){
                maxNum = prices[i];
            }

            for(int j = 0; j <= i; j++){
                if(prices[i] - prices[j] > max){
                    max = prices[i] - prices[j];
                }
            }
        }
        return max;
    }
}
