class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=start[i];
            arr[i][1]=end[i];
        }
        Comparator<int[]> co=new Comparator<int []>()
        {
            public int compare(int a[],int b[])
            {
                return a[1]-b[1];
            }
        };
        Arrays.sort(arr,co);
        int count=1;
        int s=arr[0][0];
        int e=arr[0][1];
        for(int i=1;i<n;i++)
        {
            if(arr[i][0]>e)
            {
                count++;
                e=arr[i][1];
            }
        }
        return count;
    }
}