/*package whatever //do not write package name here */

import java.util.*;

 class Solution {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		int n=Integer.parseInt(s1[0]);
		int m=Integer.parseInt(s1[1]);
		int k=Integer.parseInt(s1[2]);
		int count=0;
		for(int i=0;i<n;i++)
		{
		    String str=sc.nextLine();
		    String str1[]=str.split(" ");
		     int sum=0;
		    for(int j=0;j<k;j++)
		    {
		        sum=sum+Integer.parseInt(str1[j]);
		    }
		    int d=Integer.parseInt(str1[str1.length-1]);
		    if(sum>=m && d<=10)
		    count++;
		    
		}
		System.out.println(count);
	}
}