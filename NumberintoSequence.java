/*package whatever //do not write package name here */

import java.util.*;

public class NumberintoSequence {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{ 
		    long n=sc.nextLong();
		    long max=0;
		    long maxvar=1;
		    long N=n;
		    
		    
		    for(long i=2;i*i<=n;i++)
		    {
		        long c=n;
		        long count=0;
		        while(c%i==0  && c>1)
		        {
		            count++;
		            c=c/i;
		        }
		       
		        if(max<count)
		        {
		            max=count;
		            maxvar=i;
		        }
		        n=c;
		        if(n<=1)
		        break;
		        
		    }
		    long d=1;
		    for(int i=0;i<max;i++)
		    {
		        d=d*maxvar;
		    }
		    
		   long d1=N/d;
		   long s=d1*maxvar;
		   ArrayList<Long> a=new ArrayList<>();
		   for(int i=0;i<max-1;i++)
		   a.add(maxvar);
		   a.add(s);
		   System.out.println(a.size());
		   for(long f:a)
		   System.out.print(f+" ");
		   System.out.println();
		    
		    
		    
		    
		    
		    
		    
		    
		    
		}
	}
}