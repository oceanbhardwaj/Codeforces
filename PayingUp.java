/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i1=0;i1<t;i1++)
	    {
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	            
	        }
	        boolean s=subset(arr,0,m);
	        if(s==true)
	        {
	            System.out.println("Yes");
	        }
	        else
	        {
	            System.out.println("No");
	        }
	    }
		
	}
	public  static boolean subset(int arr[],int i,int S)
	{
	    if(S==0)
	    return true;
	    if(S<0 || i>=arr.length)
	    return false;
	    return subset(arr,i+1,S-arr[i]) || subset(arr,i+1,S);
	    
	}
}