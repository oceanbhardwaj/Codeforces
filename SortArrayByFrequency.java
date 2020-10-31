class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
         int arr2[]=new int[n];
        if(n==0)
            return arr2;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int arr[][]=new int[n][2];
        int d=0;
        for(int i:h.keySet())
        {
            int d1=h.get(i);
            for(int j=0;j<d1;j++)
            {
                arr[d][0]=i;
                arr[d][1]=d1;
                d++;
            }
        }
        Comparator co=new Comparator<int[]>()
        {
            public int compare(int a[],int b[])
            {
                if(a[1]==b[1])
                    return b[0]-a[0];
                return a[1]-b[1];
            }
            
        };
        Arrays.sort(arr,co);
       
        for(int i=0;i<n;i++)
        {
            arr2[i]=arr[i][0];
        }
        return arr2;
    }
}