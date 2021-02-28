/*package whatever //do not write package name here */

import java.util.*;

 public class GFG {
   //static long max;
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
		    int n=sc.nextInt();
		    
		    int m=sc.nextInt();
		    int arr[][]=new int[n][m];
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		            arr[i][j]=sc.nextInt();
		        }
		    }
		    int r=Integer.MIN_VALUE;
		    for(int i=0;i<m;i++)
		    {
		         r=Math.max(dfs(arr,0,0,i,n,m),r);
		    }
		        System.out.println(r);
		        
		    
		 
		}
	}
	
		//recursion
		public static  int dfs(int arr[][],int ans,int i,int j,int n,int m)
		{ if(i>=n || j>=m || j<0 || i<0)
		return 0;
		  
		    if(i==n-1)
		    {
		        //max=Math.max(max,ans+arr[i][j]);
		        return ans+arr[i][j];
		        
		    }
		
		  int ans1=Math.max(dfs(arr,ans+arr[i][j],i+1,j,n,m),dfs(arr,ans+arr[i][j],i+1,j+1,n,m));
		  
		  
		  return Math.max(dfs(arr,ans+arr[i][j],i+1,j-1,n,m),ans1);
		  
		}
		
		
		
		
		
		
		
		
		
		
		
	
}

//////////////////////////////////////////////////////////DP/////////////////////////////////////////////////////////
/*package whatever //do not write package name here */

import java.util.*;

 public class GFG {
   //static long max;
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
		    int n=sc.nextInt();
		    
		    int m=sc.nextInt();
		    int arr[][]=new int[n][m];
		    int dp[][]=new int[n][m];
		     for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		           dp[i][j]=-1; 
		            
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		            arr[i][j]=sc.nextInt();
		        }
		    }
		    for(int i=0;i<m;i++)
		    {
		        dp[0][i]=arr[0][i]; //filling first row
		    }
		    //x-1,y-1 ,  x-1,y  ,  x-1,y+1
		    int arr1[]={-1,-1,-1};
		    int brr1[]={-1,0,1};
		    for(int i=1;i<n;i++)
		    {
		       for(int j=0;j<m;j++)
		       {
		           for(int k=0;k<3;k++)
		           {
		               int a=arr1[k]+i;
		               int b=brr1[k]+j;
		               if(a<n && a>=0 && b<m && b>=0)
		               {
		                   int r=arr[i][j]+dp[a][b];
		                   dp[i][j]=Math.max(dp[i][j],r);
		               }
		           }
		       }
		        
		    }
		    int ans=Integer.MIN_VALUE;
		    for(int i=0;i<m;i++)
		    {
		        ans=Math.max(ans,dp[n-1][i]);
		    }
		    System.out.println(ans);
		    
		}
	}
	
		
	
		
		
		
		
		
		
		
		
		
		
	
}