/*package whatever //do not write package name here */

import java.util.*;

public class Restoration {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	int t2=sc.nextInt();
	
	for(int i1=0;i1<t2;i1++)
	{  
	    int n=sc.nextInt();
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    long b[]=new long[n];
	    long a[]=new long[n];
	    a[n-1]=100000009;
	    if(n==2)
	    {
	        a[0]=x;
	        a[1]=y;
	    }
	    else{
	    for(int i=0;i<n-1;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {  int diff=y-x;
	        
	            if((diff%(j-i))==0)
	            { int val=diff/(j-i);
	                b[i]=x;
	                b[j]=y;
	                for(int d=i-1;d>=0;d--)  //back
	                {
	                    b[d]=b[d+1]-val;
	                }
	                for(int d=i+1;d<n;d++)
	                {
	                    b[d]=b[d-1]+val;
	                }
	                if(b[0]>0 && b[n-1]<a[n-1])
	                {
	                    for(int k=0;k<n;k++)
	                    {
	                        a[k]=b[k]; //copy
	                        b[k]=0;
	                    }
	                }
	                
	            }  
	                
	                
	                
	                
	                
	                
	        } 
	        }
	    }
	    
	    
	    for(long h:a)
	    {
	        System.out.print(h+" ");
	    }
	    
	    System.out.println();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	}
}