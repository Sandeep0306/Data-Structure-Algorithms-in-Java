class Solution {
    public int minTaps(int n, int[] ranges) {
        int [] startEnd = new int [n+1];
       for(int i=0 ;i<ranges.length;i++){
           int start = Math.max(0, i-ranges[i]);
           int end = Math.min(n, i+ranges[i]);
           
           startEnd[start] = Math.max(startEnd[start],end);
       } 
        
        int taps =0;
        int maxEnd =0;
        int curEnd=0;
        
        for(int i=0; i<=n;i++){
            
            if(i>maxEnd){
                return -1;
            }
            
            if(i > curEnd){
                taps++;
                curEnd = maxEnd;
            }
            
            maxEnd = Math.max(maxEnd, startEnd[i]);
        }
        
        return taps;
    }
}