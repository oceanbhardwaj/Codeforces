class Solution {
    public int minInsertions(String s) {
        int i=0;
        int j=s.length()-1;
       HashMap<String,Integer> h=new HashMap<>();
       return dfs(i,j,s,h);
        
    }
    public int dfs(int i,int j,String s,HashMap<String,Integer> h)
    {

    if(i>j || i>=s.length() || j>=s.length() || i<0 || j<0)
        return 0;
        String g=i+"code"+j;
            if(h.containsKey(g))
                return h.get(g);
        if(s.charAt(i)==s.charAt(j))
            return dfs(i+1,j-1,s,h);
        int res= 1+Math.min(dfs(i+1,j,s,h),dfs(i,j-1,s,h));
        h.put(g,res);
        return res;
    
    
    
    }
}
/////////////////////////////////////////////////////////LPS VARIATION////////////////
class Solution {
    public int minInsertions(String s) {
         StringBuilder sb=new StringBuilder(s);
        String str=sb.reverse().toString();
        int n=s.length();
        int m=str.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s.charAt(i-1)==str.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return s.length()-dp[n][m];
    
    
    
    }
}