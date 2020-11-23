/*package whatever //do not write package name here */

import java.util.*;

public class Twins {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{arr[i]=sc.nextInt();
		sum=sum+arr[i];}
		
		Arrays.sort(arr);
		int d=0;
		int sum1=0;
		for(int i=arr.length-1;i>=0;i--)
		{
		    sum1=sum1+arr[i];
		    sum=sum-arr[i];
		    d++;
		    if(sum1>sum)
		    break;
		}
		System.out.println(d);
		
	}
}