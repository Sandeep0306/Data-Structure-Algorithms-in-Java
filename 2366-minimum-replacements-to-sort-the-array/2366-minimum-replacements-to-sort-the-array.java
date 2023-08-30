class Solution {
    public long minimumReplacement(int[] nums) {
      int n = nums.length;
        long min_replace =0;
        long parts =0;

        for(int i=n-2; i>=0;i--){
           if(nums[i] <=nums[i+1]) continue;

           parts = (long)((nums[i] +nums[i+1] -1)/nums[i+1]);

           min_replace += parts-1;

           nums[i] = nums[i]/ (int)parts;
        }
        return min_replace ;
    }
}

// Time Complexity: O(N) || Space complexity : O(1)