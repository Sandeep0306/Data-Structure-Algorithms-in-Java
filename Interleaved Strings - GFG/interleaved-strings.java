//{ Driver Code Starts
//initial code
import java.util.*;
import java.lang.*;
class InterLeaveString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String a =sc.next();
            String b = sc.next();
            String c = sc.next();
            Solution g=new Solution();
        
            System.out.println(g.isInterLeave(a,b,c)==true?1:0);
            t--;
        }
    }
}


// } Driver Code Ends


/*you are required to complete this method */
class Solution {
	public boolean isInterLeave(String s1,String s2,String s3)
	{
    int m =s1.length() ;
        int n = s2.length() ;
        if(m +n != s3.length()) return false;
        Boolean [][] dp = new Boolean[m+1][n+1];
        return check(s1,s2,s3,0,0,dp);
    }


    public boolean check(String s1, String s2, String s3, int i, int j, Boolean [][] dp){

        if(s1.length()==i && j == s2.length()) return true;

        if(dp[i][j] != null) return dp[i][j];

        if(i<s1.length() && s1.charAt(i)== s3.charAt(i+j)){
            boolean f1 = check(s1,s2,s3,i+1,j,dp);
            dp[i][j]= f1;
            if(f1== true){
                return true;
            }
        }
        if(j<s2.length() && s2.charAt(j)== s3.charAt(i+j)){
            boolean f2 = check(s1,s2,s3,i,j+1,dp);
            dp[i][j]= f2;
            if(f2 == true) return true;
        }

        dp[i][j] = false;

        return false;

    }
}