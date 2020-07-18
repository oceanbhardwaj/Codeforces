/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class MergeintoPermutation {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[2*n];
		    for(int i=0;i<2*n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    ArrayList<Integer> a=new ArrayList<>();
		    for(int i:arr)
		    {
		        if(!a.contains(i))
		        a.add(i);
		    }
		    for(int i:a)
		    {
		        System.out.print(i+" ");
		    }
		    System.out.println();
		    
		    
		    
		}
	}
}