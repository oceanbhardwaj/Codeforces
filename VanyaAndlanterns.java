/*package whatever //do not write package name here */

import java.util.*;

public class VanyaAndlanterns {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
	Arrays.sort(arr);
	int max=0;
	int diff[]=new int[n];
	for(int i=1;i<n;i++)
	{
	    diff[i]=arr[i]-arr[i-1];
	    max=Math.max(diff[i],max);
	}
	double d=(double)max/2;
	d=Math.max(d,l-arr[n-1]);
	
	if(arr[0]!=0 && arr[0]>d)
	d=arr[0];
	System.out.println(d);
	
	
	}
}