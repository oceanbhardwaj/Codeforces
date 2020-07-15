/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

 public class GFG {
	public static void main (String[] args) {
		

	Scanner sc=new Scanner(System.in);
	int g=sc.nextInt();
	int arr1[]=new int[g];
	for(int i=0;i<g;i++)
	{
	    arr1[i]=sc.nextInt();
	}
	int b=sc.nextInt();
	int arr2[]=new int[b];
	

		for(int i1=0;i1<b;i1++)
	{
	    arr2[i1]=sc.nextInt();
	}
	
	
	

	int count=0;
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	int i=0;
	int j=0;
	while(i<g && j<b)
	{
      if(Math.abs(arr1[i]-arr2[j])<2)
      	{count++;
      i++;
      j++;}
      else if(arr1[i]>arr2[j])
      j++;
  else if(arr1[i]<arr2[j])
  	i++;}
  System.out.println(count);
      

      
	}
}