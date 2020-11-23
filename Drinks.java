/*package whatever //do not write package name here */

import java.util.*;

public class Drinks {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
	
	double d=0;
	double d1=0;
	 for(int i=0;i<n;i++)
	 {
	     d=d+(double)((double)arr[i]/100);
	 }
	  d1=(double)((100*d)/n);
	 System.out.println(d1);
		
	}
}