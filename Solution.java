/*package whatever //do not write package name here */

import java.util.*;

class Solution {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i1=0;i1<t;i1++)
	{
	    String a=sc.next();
	    String b=sc.next();
	    char a1[]=a.toCharArray(); //@@##converting into char Array%%$$
	    char a2[]=b.toCharArray(); //&& converting into array**$$
	    int countans=0; //final output$$@@>>>>>>>>>>>>>>>>>>>>>
	   
	       for(int xodd=0;xodd<a.length();xodd++)  //&& checking for odd loop##$$
	       {
	           if(a1[xodd]==a2[xodd]) //if same## no change@@@$$
	           continue;
	           int dodd=xodd;
	               while(dodd<a.length() && a1[dodd]!=a2[dodd]) //@@checking for odd indices@@%^*
	               {
	                   a1[dodd]=a2[dodd];
	                   dodd=dodd+2; //@@adding +2 for moving to oddposition
	               }
	               
	           
	           countans++;
	       }
	        
	        
	       System.out.println(countans);//@@final ans$%%$$
	}
	}
}