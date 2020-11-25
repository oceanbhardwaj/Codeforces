/*package whatever //do not write package name here */

import java.util.*;

public class SpecialPermutation {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    
		    for(int j=2;j<=n;j++)
		    {
		        System.out.print(j+" ");
		    }
		    System.out.print(1+" ");
		    System.out.println();
		}
	}
}