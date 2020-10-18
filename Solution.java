/*package whatever //do not write package name here */

import java.util.*;

  public class Solution{
  
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	for(int i1=1;i1<=t;i1++)
	{
	    String s=sc.next();
	    int n=s.length();
	    HashMap<String,ArrayList<Integer>> h=new HashMap<>();
	    for(int i=0;i<=n-4;i++)
	    {
	      String s1=s.substring(i,i+4); 
	      if(s1.equals("KICK"))
	      {
	          h.putIfAbsent(s1,new ArrayList<>());
	          h.get("KICK").add(i);
	      }
	    }
	    for(int i=0;i<=n-5;i++)
	    {
	      String s2=s.substring(i,i+5); 
	      if(s2.equals("START"))
	      {
	          h.putIfAbsent(s2,new ArrayList<>());
	          h.get("START").add(i);
	      }
	    }
	    
	        ArrayList<Integer> l1=h.get("KICK");
	        ArrayList<Integer> l2=h.get("START");
	        Collections.sort(l1);
	        Collections.sort(l2);
	        
	        int count=0;
	        for(int i:l1)
	        {
	            for(int j:l2)
	            {
	                if(i<j)
	                count++;
	            }
	            
	        }
	        System.out.println("Case #"+i1+":"+" "+count);
	        
	   
	    
	    
	    
	    
	    
	}
		
		        
		        
		        
		        	
		
		
		
	}
}