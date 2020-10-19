
import java.util.*;

 public class StringTask{
  
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	s=s.toLowerCase();
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<s.length();i++)
	{
	    if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!='y' )
	    sb.append(s.charAt(i));
	}
	String s1=sb.toString();
	StringBuffer sb1=new StringBuffer();
	for(int i=0;i<s1.length();i++)
	{
	    sb1.append(".");
	    sb1.append(s1.charAt(i));
	}
	String res=sb1.toString();
	
	  System.out.println(res);  
	       
	       
	}     
	
	}