/*class Tuples
{
	public static void main(String[] args) 
	{
		int arr[]={3,4,7,1,2,9,8};
		int count=0;
		int n=arr.length;
		for(int i=0;i<n-3;i++)
		{
			for(int j=i+1;j<n-2;j++)
			{
            for(int k=j+1;k<n-1;k++)
            {
            	for(int l=k+1;l<n;l++)
            	{
            		if((arr[i]+arr[j]==arr[k]+arr[l])||(arr[i]+arr[k]==arr[j]+arr[l]) || (arr[i]+arr[l]==arr[k]+arr[j]) )
            			count++;
            	}
            }
			}
		}
		System.out.println(count);
	}
}*/

import java.util.*;
class Tuples
{
	public static void main(String[] args) 
	{
		int arr[]={3,4,7,1,2,9,8};
		int count=0;
		int n=arr.length;
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<n-1;i++)
		{
         for(int j=i+1;j<n;j++)
         {
          h.put(arr[i]+arr[j],h.getOrDefault(arr[i]+arr[j],0)+1);
         }
		}
		for(int i:h.keySet())
		{
			int val=h.get(i);
			if(val>1)
			{
            count+=val*(val-1)/2;
			}
		}
		System.out.println(count);
	}
}



