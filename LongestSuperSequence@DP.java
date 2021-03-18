class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        String concat=str1+str2;
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        {
       for(int j=1;j<=m;j++)
        {
          if(str1.charAt(i-1)==str2.charAt(j-1))
              dp[i][j]=1+dp[i-1][j-1];
           else
               dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
        }
        
        //print LCS
        int i=n;
        int j=m;
        StringBuilder sb=new StringBuilder();
        while(i>0 && j>0 )
        {
            if(str1.charAt(i-1)==str2.charAt(j-1))
            {
                sb.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>=dp[i][j-1])
            {
            i--;
            }
            else if (dp[i-1][j]<dp[i][j-1])
                j--;
                
        }
         sb.reverse();
        String lcs=sb.toString();
       
        int t1=0;
        int t2=0;
        int t3=0;
       // return lcs;
        sb=new StringBuilder();
        
        while(t1<str1.length() || t2<str2.length() || t3<lcs.length())
        {
            while(t3<lcs.length() && t1<str1.length() && str1.charAt(t1)!=lcs.charAt(t3))
            {
                
            sb.append(str1.charAt(t1));
                System.out.println(sb.toString());
                t1++;
            }
            while(t3<lcs.length() && t2<str2.length() && str2.charAt(t2)!=lcs.charAt(t3))
            {
                
            sb.append(str2.charAt(t2));
                System.out.println(sb.toString());
                t2++;
            }
            if(t3<lcs.length())
            {
                sb.append(lcs.charAt(t3));
                System.out.println(sb.toString());
                t3++;
                t1++;
                t2++;
            }
            if(t3>=lcs.length() && t1<str1.length())
            {
                sb.append(str1.charAt(t1++));
                System.out.println(sb.toString());}
            if(t3>=lcs.length() && t2<str2.length())
            {
                 sb.append(str2.charAt(t2++));
                System.out.println(sb.toString());
                
            }
            
            
            
        }
        return sb.toString();
        
        
    }
}