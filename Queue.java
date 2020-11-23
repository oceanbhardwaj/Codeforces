/*package whatever //do not write package name here */

import java.util.*;

public class Queue {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		String s=sc.next();
		char ch[]=s.toCharArray();
		for(int i=0;i<t;i++)
		{
		    for(int j=0;j<s.length()-1;j++)
		    {
		        if(ch[j]=='B' && ch[j+1]=='G')
		        {ch[j+1]='B';
		        ch[j]='G';
		            j++;
		        }
		    }
		    
		}
		String str1=String.valueOf(ch);
		System.out.println(str1);
		
	}
}