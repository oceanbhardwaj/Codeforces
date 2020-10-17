/*package whatever //do not write package name here */

import java.util.*;

 public class WayTooLongWords{
  
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    String s=sc.next();
		    int n=s.length();
		    if(n<=10)
		    System.out.println(s);
		    else{
		        int d=s.length()-2;
		        char c1=s.charAt(0);
		        char c2=s.charAt(n-1);
		       System.out.print(c1);
		        System.out.print(d);
		         System.out.println(c2);
		        
		        
		        
		        
		    }
		}
		
		
		
		
	}
}