/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
		    int n=sc.nextInt();
		    long arr[]=new long[n];
		    int even=0;
		    int odd=0;
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		        if(arr[i]%2==0)
		        even++;
		        else
		        odd++;
		    }
		    int ans=0;
		    if(even==0 || odd==0)
		    ans=0;
		    else
		    ans=Math.min(even,odd);
		   
		    
		    
		    System.out.println(ans);
		}
	}
}