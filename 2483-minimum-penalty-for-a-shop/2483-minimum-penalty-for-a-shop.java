class Solution {
    public int bestClosingTime(String customers) {
       int min_Penalty =0;
       for(int i=0; i<customers.length();i++){
           if(customers.charAt(i)=='Y') min_Penalty++;
       }
       int cur_Penalty =min_Penalty;
       int earlier_hour =0;
       int n = customers.length();

       for(int i=0; i<n;i++){
           if(customers.charAt(i)=='Y'){
               cur_Penalty--;
           }else {
               cur_Penalty++;
           }

           if(cur_Penalty <min_Penalty){
               earlier_hour= i+1;
               min_Penalty = cur_Penalty;
           }
       }

       return earlier_hour;
    }
}