/*package whatever //do not write package name here */

import java.util.*;

public class AlternatingSubsequence {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
		    PriorityQueue<Long> pq=new PriorityQueue<Long>(Collections.reverseOrder());
		    int n=sc.nextInt();
		    long arr[]=new long[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    long sum=0;
		    int j=0;
		    while(j<n)
		    {
		        if(arr[j]<0)
		        {
		            while(j<n && arr[j]<0)
		            { 
		                pq.add(arr[j]);
		                j++;
		            }
		        }
		        else
		        if(arr[j]>0)
		        {
		            while(j<n && arr[j]>0)
		            { 
		                pq.add(arr[j]);
		                j++;
		            }
		        }
		        if(!pq.isEmpty())
		        sum=sum+pq.remove();
		        pq.clear();
		        
		        
		        
		    }
		        
		   System.out.println(sum);
		        
		        
		        
		        
		        
		    }
		    
		    
		    
		}
	
}