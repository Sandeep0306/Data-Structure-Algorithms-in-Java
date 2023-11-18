class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);

        int numberOfBoats=0;
        int left =0, right =n-1;
        
        while(left <= right){
            if(people[left] + people[right] <= limit){
                numberOfBoats++;
                left++;
                right--;
            }
            else {
                numberOfBoats++;
                right--;
            }
        }
        return numberOfBoats;
    }
}