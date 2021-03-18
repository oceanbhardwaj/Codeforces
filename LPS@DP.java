class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        
        boolean dp[][]=new boolean[n][n];
        int max=0;
        String v="";
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i==j)
                {
                    dp[i][j]=true;
                    max=1;
                    v=s.substring(i,j+1);      //for one length
                }
            }
        }
        //length 2
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=true; 
                
            
                v=s.substring(i,i+2);
            max=2;
                
                
            }
        }
         
        //length more than 2
        for(int k=3;k<=n;k++) //loop for length
        { //System.out.println("jjjjjjjjjjjjjjjjjjjjjjj");
            for(int start=0;start<=n-k;start++)
            {
                int end=start+k-1;
                if(s.charAt(start)==s.charAt(end) && dp[start+1][end-1]==true)
                {

                  dp[start][end]=true;
                    if(max<k)
                    {
                        max=k;
                        v=s.substring(start,end+1);
                    }
                    
                
                
                }
                
                
            }
        }
        
        return v;
        
        
        
    }
}