class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n=text1.length();
        int m=text2.length();
        if(n==0 || m==0)
            return 0;
        return call(text1,text2,n-1,m-1);
        
        
    }
    public int call(String s1,String s2,int n,int m)
    {
        if(n<0 || m<0)
            return 0;
        if(s1.charAt(n)==s2.charAt(m))
            return 1+call(s1,s2,n-1,m-1);
        
        return Math.max(call(s1,s2,n,m-1),call(s1,s2,n-1,m));
    }
    
}
/////////////////////////////////////////////////////////////Memo
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n=text1.length();
        int m=text2.length();
        if(n==0 || m==0)
            return 0;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
Arrays.fill(dp[i],-1);
        }
        return call(text1,text2,n-1,m-1,dp);
        
        
    }
    public int call(String s1,String s2,int n,int m,int dp[][])
    {
        if(n<0 || m<0)
            return 0;
        if(dp[n][m]!=-1)
            return dp[n][m];
        if(s1.charAt(n)==s2.charAt(m))
            return 1+call(s1,s2,n-1,m-1,dp);
        
        return dp[n][m]= Math.max(call(s1,s2,n,m-1,dp),call(s1,s2,n-1,m,dp));
    }
    
}
/////////////////////////////////////////////////DP////////////////////////////////////

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n=text1.length();
        int m=text2.length();
        if(n==0 || m==0)
            return 0;
        int dp[][]=new int[n+1][m+1];
        
        for(int i=1;i<=n;i++)
        {

             for(int j=1;j<=m;j++)
          {
            if(text1.charAt(i-1)==text2.charAt(j-1))
             dp[i][j]=1+dp[i-1][j-1];
            else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
           }
        
        }
        
        
        
        
        
        return dp[n][m];
        
        
    }
    
}
