class Solution {
    public String longestPalindrome(String s) {
        boolean dp[][]=new boolean [s.length()][s.length()];
        if(s.length()==0)
            return "";
        int start=0;
        int end=0;
        int max=0;
        for(int i=0;i<s.length();i++) //for one length
        {
       for(int j=0;j<s.length();j++)
        {
           if(i==j)
           {dp[i][j]=true;
             start=i;
             end=j;
            max=1;
           }
          }
        
        }
        
       //for two length
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=true;
                start=i;
                end=i+1;
                max=2;
                
            }
        }
        //for more than 3 length
        for(int k=3;k<=s.length();k++) //length
        {
            for(int i=0;i<=s.length()-k;i++)
            {
                int e=i+k-1;
                if(s.charAt(i)==s.charAt(e) && dp[i+1][e-1] )
                {
                    dp[i][e]=true;
                    if(k>max){
                    start=i;
                    end=e;
                    max=k;
                    }
                }
            }
        }
        
        return s.substring(start,end+1);
    }
}