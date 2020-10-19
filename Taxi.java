
import java.util.*;

 public class Taxi{
  
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	    sum=sum+arr[i];
	}
   int count1=0;
   int count2=0;
   int count3=0;
   int d=0;
   Arrays.sort(arr);
   for(int i=n-1;i>=0;i--)
   {
       if(arr[i]==4)
       d++;
       else if(arr[i]==1)
       {
           if(count3>0)
           {
               d++;
               count3--;
           }
           else if(count2>0 && count1>0)
           {
              count2--;
              count1--;
              d++;
           }
           else if(count1>3)
           {
               d++;
               count1=count1-3;
           }
           else
           count1++;
               
           
       }
       else if(arr[i]==2)
       {
           if(count2>0)
           {
               count2--;
               d++;
               
           }
           else if(count1>2)
           {
               d++;
               count1=count1-2;
           }
           else
           count2++;
       }
       else if(arr[i]==3)
       {
           if(count1>0)
           {
               d++;
               count1--;
           }
           else
           count3++;
       }
       
   }

if(count3!=0)
d=d+count3;

 if(count2>0)
 {
     if(count2>0 && count1>0)
     {
        
         d=d+count2;
         count1=count1-count2;
         count2=0;
         
     }
     else if(count2>0)
     {
         if(count2>1 )
{d=d+count2/2;
d=d+count2%2;}
    else
    d=d+count2;
    }}
if(count1!=0)
{
    if(count1>4)
   { d=d+count1/4;
   d=d+count1%4;}
    else
    d++;
}


if(sum<=4)
System.out.println("1");
else
	System.out.println(d);
	    
	    
	    
	    
	    
	    
	
	}
 }