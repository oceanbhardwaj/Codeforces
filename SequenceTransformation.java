/*package whatever //do not write package name here */

import java.util.*;

public class SequenceTransformation {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();}
		        HashMap<Integer,ArrayList<Integer>>h=new HashMap<>();
		        for(int i=0;i<n;i++)
		        {
		           if(h.containsKey(arr[i]))
		          h.get(arr[i]).add(i);
		          else
		         { h.put(arr[i],new ArrayList<Integer>());
		         h.get(arr[i]).add(i);
		         }
		        }
		        int min=Integer.MAX_VALUE;
		        int count=0;
		        for(int j:h.keySet())
		        { count=0;
		            ArrayList<Integer> l=h.get(j);
		            int n1=l.size();
		            for(int e=1;e<l.size();e++)
		            {
		                if(l.get(e)-l.get(e-1)>1)
		                count++;
		            }
		            if(l.get(0)!=0)
		            count++;
		            if(l.get(n1-1)!=n-1 && l.get(n1-1)!=0)
		            count++;
		            min=Math.min(min,count);
		        }
		        if(min==0 && h.size()>1)
		        min=1;
		        if(h.size()==1)
		        min=0;
		        System.out.println(min);
		}
	}
}