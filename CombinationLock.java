
import java.util.*;

 public class Solution{
  
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	for(int i1=1;i1<=t;i1++)
	{
	    
	       int w=sc.nextInt();
	       int n=sc.nextInt();
	       int arr[]=new int[w];
	       for(int i=0;i<w;i++)
	       {
	           arr[i]=sc.nextInt();
	       }
	       int min=Integer.MAX_VALUE;
	       for(int x=1;x<=n;x++)
	       { int sum=0;
	        
	       int d=0;
	           for(int i=0;i<w;i++)
	           {
	               
	               if(arr[i]<x)
	               { if(arr[i]-x+n<0 || x-arr[i]<0)
	               break;
	                 d=Math.min(arr[i]-x+n,x-arr[i]);
	               }
	                else
	                 { if(n-arr[i]+1<0 || arr[i]-x<0)
	                 break;
	                     d=Math.min(n-arr[i]+x,arr[i]-x);}
	               sum=sum+d;
	           }
	           min=Math.min(sum,min);
	}
	            
	           
	           
	           
	           
	       
	        System.out.println("Case #"+i1+":"+" "+min);
	    
	    
	    
	}
		
		        
		        
		        
		        	
		
		
		
	}
}