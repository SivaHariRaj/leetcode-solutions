class Solution {
    public int maxProfit(int[] prices)
    {
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++)
        {
            maxprofit=Math.max(maxprofit,(prices[i]-minprice));
            if(minprice>prices[i])
            {
                   minprice=prices[i];
            }
        }    
        return maxprofit; 
    }
}