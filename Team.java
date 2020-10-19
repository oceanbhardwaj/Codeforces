
import java.util.*;

 public class Team{
  
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int d=0;
	for(int i1=1;i1<=t;i1++)
	{
	    int count=0;
	       int a1=sc.nextInt();
	       if(a1==1)
	       count++;
	       
	       int a2=sc.nextInt();
	       if(a2==1)
	       count++;
	       
	       int a3=sc.nextInt();
	       if(a3==1)
	       count++;
	       if(count>=2)
	       d++;
	       
	}    
	       System.out.println(d);
	       
	       
	       
	       
	       
	       
	       
	}     
	
	}