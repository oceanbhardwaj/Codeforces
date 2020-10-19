
import java.util.*;

 public class Chatroom{
  
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
String s=sc.nextLine();


String str="hello";
int j=0;
int d=0;
for(int i=0;i<s.length();i++)
{
    
    if(s.charAt(i)==str.charAt(j))
    {
        
        j++;
    }
    else if(s.charAt(i)!=str.charAt(j))
    {
        
        continue;
    }
    if(j>=5)
    {
        d=1;
        break;
    }
    
    
    
    
}

if(d==1)
System.out.println("YES");
else
System.out.println("NO");
	
	
	
	
	}
 }