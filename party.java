
import java.util.*;

class GFG {
  
	static int max=Integer.MIN_VALUE;
	static int min=Integer.MIN_VALUE;
	
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext())
	{
	    int total_budget=sc.nextInt();
	    int n=sc.nextInt();
	    if(total_budget==0 && n==0)
	    break;
	    int budget[]=new int[n];
	    int fun[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        budget[i]=sc.nextInt();
	        fun[i]=sc.nextInt();
	    }
	     max=Integer.MIN_VALUE; //fun
	     min=Integer.MAX_VALUE;//budget
	   int dp[][]=new int[n+1][total_budget+1];
	   
	  for(int i=1;i<=n;i++)
	  {
	      for(int j=1;j<=total_budget;j++)
	      {
	          if(budget[i-1]<=j)
	          {
	              dp[i][j]=Math.max(dp[i-1][j-budget[i-1]]+fun[i-1],dp[i-1][j]);
	          }
	          else
	          dp[i][j]=dp[i-1][j];
	      }
	  }
	  int max=dp[n][total_budget];
	  for(int i=0;i<=n;i++)
	  {
	      for(int j=0;j<total_budget+1;j++)
	      { if(dp[i][j]==max)
	      {
	          min=Math.min(min,j);
	      }
	      }
	  }
	  System.out.println(min+" "+max);
	  
	
	}
	}
	
}