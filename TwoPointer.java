/*package whatever //do not write package name here */

import java.util.*;

public  class TwoPointer {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		    int n=sc.nextInt();
		    int a[]=new int[100005];
		    int count[]=new int[100005];
		    for(int i=0;i<n;i++)
		    {
		        int d=sc.nextInt();
		        a[d]++;
		        count[a[d]]++;
		        
		    }
		    
		     
		    
		        
		        int q=sc.nextInt();
		        for(int j=0;j<q;j++)
		        {
		           char c=sc.next().charAt(0);
		           int d1=sc.nextInt();
		           if(c=='+')
		           {
		               a[d1]++;
		               count[a[d1]]++;
		           }
		           else
		           {
		               
		               count[a[d1]]--;
		               a[d1]--;
		           }
		         if(count[4]>=2 || count[8]>0 || (count[2]>=2 && count[6]>0) || (count[4]>0 && count[2]>=3))   
		           System.out.println("YES");
		           else
		           System.out.println("NO");
		            
		            
		            
		        } 
		           
		  
		        
		        
		        
		        
		        
		    
		
	}
}