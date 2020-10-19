
import java.util.*;

 public class Matrix{
  
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	int arr[][]=new int[5][5];
	int i1=0;
	int j1=0;
	for(int i=0;i<5;i++)
	{
	    for(int j=0;j<5;j++)
	    {
	        arr[i][j]=sc.nextInt();
	        if(arr[i][j]==1)
	        {
	            i1=i+1;
	            j1=j+1;
	        }
	    }
	}
	int count=Math.abs(i1-3)+Math.abs(j1-3);
	System.out.println(count);
	}
 }