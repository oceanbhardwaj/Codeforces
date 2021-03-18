class Solution {
    public int countSubstrings(String s) {
        int count=s.length();
        int n=s.length();
        boolean dp[][]=new boolean[s.length()][s.length()];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    dp[i][j]=true;  //length 1
            }
        }
        for(int i=0;i<s.length()-1;i++)
        {

        if(s.charAt(i)==s.charAt(i+1)) //length2 
        {
            dp[i][i+1]=true;
            count++;
        }
            
            }
        
        for(int k=3;k<=s.length();k++)
        {
            for(int start=0;start<=n-k;start++)
            {
                int end=start+k-1;
                if(s.charAt(start)==s.charAt(end) && dp[start+1][end-1]==true)
                { dp[start][end]=true;
                    count++;}
            }
        }
        return count;
    }
}