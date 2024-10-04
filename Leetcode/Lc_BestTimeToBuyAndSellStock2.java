class Lc_BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int sell = 0;
        boolean choose = true;

        for(int i = 1; i < prices.length;i++){
            if(prices[i] < buy && choose){
                buy = prices[i];
            }
            else if(prices[i] > sell){
                sell = prices[i];
                choose = false;
            }
            else {
                    profit += sell - buy;
                    buy = prices[i];
                    sell = prices[i];
                    choose = true;
            }

        }
        return  profit;
    }

    public static void main(String[] args) {
        Lc_BestTimeToBuyAndSellStock2 s = new Lc_BestTimeToBuyAndSellStock2();
        int [] a = {3,2,6,5,0,3};
        System.out.println(s.maxProfit(a));
    }


}
