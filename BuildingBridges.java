import java.util.*;
class BuildingBriges
{
	public static void main(String[] args) {
		int values[][] = {{6, 2},{4, 3},{2, 6},{1, 5}};
		int arr[]=new int[4];
		int n=4;
		Comparator co=new Comparator<int[]>()
		{
        public int compare(int a[],int b[])
        { if(a[0]==a[1])
        	return b[0]-b[1];
        	return a[0]-a[1];//based on x;
        }
		};
		Arrays.sort(values,co);
		for(int i=0;i<n;i++)
		{
			arr[i]=values[i][1];
		}

       int lis[]=new int[4];
       Arrays.fill(lis,1);
       for(int i=1;i<n;i++)
       {
       	for(int j=i-1;j>=0;j--)
       	{
       		if(arr[j]<arr[i] && lis[j]+1>lis[i])
       			lis[i]=lis[j]+1;
       	}
       }
       int max=0;

       for(int i=0;i<n;i++)
       {
       	max=Math.max(lis[i],max);
       }
       System.out.println(max);



	}
}