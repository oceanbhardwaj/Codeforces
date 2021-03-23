class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        return dfs(s,0,dp);
    }
    public int dfs(String s,int i,int dp[])
    {
         if(i>=s.length())
            return 1;
         if(s.charAt(i)=='0')
            return 0;
        if(i==s.length()-1)
            return 1;
        if(dp[i]!=-1)
            return dp[i];
        
        
       
       
        int way1=dfs(s,i+1,dp);
         int d=Integer.parseInt(s.substring(i,i+2));
        int way2=0;
        if(d<=26)
            way2=dfs(s,i+2,dp);
        return dp[i]= way1+way2;
    }
}