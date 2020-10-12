
/*package whatever //do not write package name here */

import java.util.*;

 public class BadSequence {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Character> stack=new Stack<>();
	      int n=sc.nextInt();
	      String s=sc.next();
	      
	      
	      int close=0;
	      
	      
	      for(int i=0;i<n;i++)
	      {
	          if(s.charAt(i)==')')
	         { close++;
	          
	              if(!stack.isEmpty())
	              {
	                  stack.pop();
	                  close--;
	              }
	          
	         }
	          else{
	          stack.push(s.charAt(i));
	          }
	      }
	      if((stack.isEmpty() && close==0) || (close==1 && stack.size()==1))
	      System.out.println("Yes");
	      else
	      System.out.println("No");
		   
		        
		        
		        
		   
		}
	
}