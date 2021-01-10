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
		    int arr1[]=new int[n];
		    int arr2[]=new int[m];
		    int sum1=0;
		    int sum2=0;
		     PriorityQueue<Integer> p1=new PriorityQueue<>();
		    PriorityQueue<Integer> p2=new PriorityQueue<>(Collections.reverseOrder());
		    for(int i=0;i<n;i++)
		    {
		        arr1[i]=sc.nextInt();
		        p1.add(arr1[i]);
		        sum1=sum1+arr1[i];
		        
		    }
		    for(int i=0;i<m;i++)
		    {
		        arr2[i]=sc.nextInt();
		        p2.add(arr2[i]);
		        sum2=sum2+arr2[i];
		        
		    }
		    int count=0;
		    while(sum1<=sum2 && !p1.isEmpty() && !p2.isEmpty())
		    {
		        int d1=p1.poll();
		       
		        int d2=p2.poll();
		        if(d1<d2){
		         sum1=sum1-d1;
		        sum2=sum2-d2;
		        count++;
		        sum1=sum1+d2;
		        sum2=sum2+d1;}
		        else
		        break;
		        if(p1.isEmpty() || p2.isEmpty())
		        break;
		    }
		    if(sum1<=sum2)
		    count=-1;
		    
		    
		   System.out.println(count);
		    
		}
	}
}