class Solution {
    int mod = 1000000007;
    public int countOrders(int n) {
        if(n==1) return 1;
        long result =1;

        for(int i=2; i<=n;i++){
            int spaces = (i-1)*2 +1;
            int temp = spaces *(spaces+1)/2;
            result *= temp;
            result %=mod;
            
        }

        return (int)result;
    }
}