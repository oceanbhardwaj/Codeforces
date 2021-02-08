import java.util.*;
/*class subsequences
{
	public static void main(String[] args) {
		int arr[]={45, 34, 4, 12, 5, 2};
		int sum=42;
		ArrayList<Integer> a=new ArrayList<>();
		int max=0;
		

		call(a,arr,0,0);
		for(int i:a)
			{
				if(i<=sum && i>max)
					max=i;
			}
		System.out.println(max);
	}
	public static  void call(ArrayList<Integer> a,int arr[],int sum,int i)
	{
      if(i==arr.length)
      	{a.add(sum);
      		return;}
      call(a,arr,sum+arr[i],i+1);
      call(a,arr,sum,i+1);
	}
	
}*/

////////////////////////////////////////////////////////////////////////////////
//meet in the middle
import java.util.*;
class subsequences
{
	public static void main(String[] args) {
		int arr[]={45, 34, 4, 12, 5, 2};
		int sum=42;
		int n=arr.length;
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> b=new ArrayList<>();
		call(a,arr,0,0,n/2);
		call(b,arr,0,n/2,n);
		Collections.sort(a);
		int max=0;
		for(int ele:b)
		{
			if(ele==sum)
				System.out.println(ele);
			else if(ele>sum)
				continue;
			else 
			{ int left=sum-ele;
				if(a.get(0)>left)
				{
						if(a.get(0)+ele<sum)
					max=Math.max(a.get(0)+ele,max);
				}
				else if(a.get(a.size()-1)<left)
					{
							if(a.get(a.size()-1)+ele<sum)
								max=Math.max(a.get(a.size()-1)+ele,max);}
				else
				{
					int pos=Collections.binarySearch(a,left);
					int low=0;
					if(pos>=0)
					{
						low=0;
							if(a.get(low)+ele<sum)
						max=Math.max(a.get(low)+ele,max);


					}
					else 
					{
						pos=-pos-1;
						low=pos-1;
						if(a.get(low)+ele<sum)
						max=Math.max(a.get(low)+ele,max);
						if(a.get(pos)+ele<sum)
						max=Math.max(a.get(pos)+ele,max);
					}
				}
			}



		}
		System.out.println(max);
		
	}
	public static  void call(ArrayList<Integer> a,int arr[],int sum,int i,int end)
	{
      if(i==end)
      	{a.add(sum);
      		return;}
      call(a,arr,sum+arr[i],i+1,end);
      call(a,arr,sum,i+1,end);
	}
	
}