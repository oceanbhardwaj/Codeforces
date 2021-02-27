
import java.util.*;
class KPartition
{
	public static void main(String[] args) 
	{
		
		ArrayList<ArrayList<Integer>> aa=new ArrayList<>();
		for(int i=0;i<2;i++)
		{
			aa.add(new ArrayList<Integer>());
		}
		int arr[]={1,2,3};
		int n=arr.length;
//int n=3;
		dfs(aa,0,0,2,n,arr);
	}
	public static  void dfs(ArrayList<ArrayList<Integer>> aa,int i,int count,int k,int n,int arr[])
	{
if(i>=n)
{
  if(count==k)
  {
  	for(ArrayList<Integer> a:aa)
  		{ if(a.size()!=0)
  		System.out.print(a+"  ");
  	}
  }
  System.out.println();
return;



}





      for(int j=0;j<aa.size();j++) //arraylist traverse 
     {//System.out.println("line 12");
     if(aa.get(j).size()>0)
     {
     	//System.out.println("line 11");
     	aa.get(j).add(arr[i]);
     	dfs(aa,i+1,count,k,n,arr);
     	aa.get(j).remove(aa.get(j).size()-1);

     }
     else
     { //System.out.println("line 1");
     	aa.get(j).add(arr[i]);
     	//System.out.println("line 2");
     	dfs(aa,i+1,count+1,k,n,arr);
     	aa.get(j).remove(aa.get(j).size()-1);

     	break;
     }
     }
	}
}