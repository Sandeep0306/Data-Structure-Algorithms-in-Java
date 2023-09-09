class Solution {
    public int combinationSum4(int[] coins, int amount) {
        if(amount ==0) return 0;
        int [] dp =new int[amount +1];
        dp[0]=1;
        for(int i=1; i<dp.length;i++){
            for(int j= 0; j<coins.length;j++){
                if(coins[j] <=i){
                    int ramt = i-coins[j];
                    dp[i] += dp[ramt];
                }
            }
        }
        
         return dp[amount];
    }
}