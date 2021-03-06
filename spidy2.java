/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    //static int ans1=Integer.MAX_VALUE;
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	
		   
		    int n=sc.nextInt();
		  
		    long arr[]=new long[n];
		    long dp[]=new long[n];
		    Arrays.fill(dp,Long.MAX_VALUE);
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
		     dp[0]=0;
		    if(n==1)
		    {
		        System.out.println("0");
		    }
		    else if(n>=2){
		    dp[1]=arr[1]-arr[0];
		    for(int i=2;i<n;i++)
		    { long ans=Long.MAX_VALUE;
		    int j=1;
		        while(j<=i)
		        { //if(i-j==1 || (i-j)%2==0)
		            long r=dp[i-j]+Math.abs(arr[i]-arr[i-j]);
		            dp[i]=Math.min(dp[i],r);
		            j=j*2;
		           }
		           
		        }
		       
		    
		    
		    //for(int i=0;i<n;i++)
		    System.out.println(dp[n-1]);
		    }
		   
		}
	
}