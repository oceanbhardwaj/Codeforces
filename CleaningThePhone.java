/*package whatever //do not write package name here */

import java.util.*;

 public class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		    int sum=0;
		    int sum1=0;
		    for(int i=0;i<n;i++)
		    {a[i]=sc.nextInt();
		    sum=sum+a[i];}
		    for(int i=0;i<n;i++)
		    {b[i]=sc.nextInt();
		    sum1=sum1+b[i];}
		     ArrayList<Integer> aa=new ArrayList<>();//1
		     ArrayList<Integer> bb=new ArrayList<>();//2
		     for(int i=0;i<n;i++)
		     {
		         if(b[i]==1)
		         aa.add(a[i]);
		         else
		         bb.add(a[i]);
		     }
		     Collections.sort(aa);
		     Collections.sort(bb);
		     Collections.reverse(aa);
		     Collections.reverse(bb);
		     ArrayList<Long> aa1=new ArrayList<>();//1
		     ArrayList<Long> bb1=new ArrayList<>();//2
		     long prev=0;
		     for(int ele:aa)
		     {
		         prev=prev+ele;
		         //System.out.println(prev+" ");
		         aa1.add(prev);
		         
		     }
		    // System.out.println("JKKKKKKKKKKKKKK");
		      prev=0;
		     for(int ele:bb)
		     {
		         prev=prev+ele;
		        // System.out.println(prev+" ");
		         bb1.add(prev);
		         
		     }
		     
		     long min=Long.MAX_VALUE;
		     if(sum<m)
		     {
		         min=-1;
		     }
		     else if(sum==m)
		     {
		         min=sum1;
		     }
		     if(aa1.size()==0)
		     {
		         
		         for(int i=0;i<bb1.size();i++)
		         {
		             if(bb1.get(i)>=m)
		             {
		                 min=Math.min((i+1)*2,min);
		                 break;
		             }
		         }
		     }
		     else  if(bb1.size()==0)
		     {
		         
		         for(int i=0;i<aa1.size();i++)
		         {
		             if(aa1.get(i)>=m)
		             {
		                 min=Math.min((i+1),min);
		                 break;
		             }
		         }
		     }
		     else{
		     for(int i=0;i<aa1.size();i++)
		     {
		         long x=aa1.get(i);//aa
		         int reqm=m-(int)x;
		        int index=-1;
		          if(reqm<=0)
		          {
		              min=Math.min(i+1,min);
		          }
		         if(reqm>0){
		        
		         index=bs(bb1,reqm);
		         //System.out.println(index);
		         long count=0;
		        if(index!=-1 && bb1.get(index)>=reqm)
		         
		         {
		             count=(i+1)+(index+1)*2;
		             min=Math.min(count,min);
		         }}
		     }}
		     if(min==Integer.MAX_VALUE)
		     min=-1;
		     System.out.println(min);
		     
		    
		}
	}
		public static int bs(ArrayList<Long> bb1,int target)
		{
		    int left=0;
		    int right=bb1.size()-1;
		    int index=-1;
		    
		    while(left<=right)
		    {
		        int mid=(left+right)/2;
		        if(bb1.get(mid)==target)
		        {
		            index=mid;
		            break;
		        }
		        else if(bb1.get(mid)<target)
		        {
		        left=mid+1;}
		        else
		       { index=mid;
		        right=mid-1;}
		    }
		    return index;                    
		}
	
}