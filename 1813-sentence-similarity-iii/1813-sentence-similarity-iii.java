class Solution {
    public boolean areSentencesSimilar(String str1, String str2) {
       var s1 = str1.split(" ");
       var s2 = str2.split(" ");
        if(s1.length > s2.length){
            var t = s1;
            s1 = s2;
            s2= t;
            
        }
        int m = s1.length, n = s2.length;

        int  i=0, j =0;

        while(i <m && s1[i].equals(s2[i])){
            i++;
        }

        while(j<m && s1[m-1-j].equals(s2[n-1-j])){
            j++;
        }

       return i+j >=m;
        
    }
}