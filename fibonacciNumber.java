class Solution {
    public int fib(int n) {
        /*
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        return fib(n-1)+fib(n-2);
        
        */
        /*
        //iterative
        int a=0;
        int b=1;
        if(n==0)
            return a;
        if(n==1)
            return b;
        int c=0;
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return b;
        */
        //dp
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}