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
        int i=n;
        int j=m;
       StringBuilder sb=new StringBuilder();
        while(i>0 && j>0)
        {
            if(text1.charAt(i-1)==text2.charAt(j-1))
            {
                sb.append(text1.charAt(i-1));
                i--;
                j--;
            }
            else
            {
             int d1=dp[i-1][j];
                int d2=dp[i][j-1];
                if(d1>d2)
                {
                    i--;
                }
                else
                    j--;
                 
                
                
                
                
            }
        }
        sb.reverse();
        System.out.println(sb.toString());
        
        
        
        
        
        return dp[n][m];
        
        
    }
    
}