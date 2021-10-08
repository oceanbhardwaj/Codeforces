class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    //making a unique array for unique elements
       
    HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int unique[]=new int[h.size()];
        int index=0;
        for(int i:h.keySet())
        {
            unique[index++]=i;
        }
        Quickselect(unique,0,unique.length-1,h,unique.length-k);
      return  Arrays.copyOfRange(unique,h.size()-k,h.size());
    }
    public void Quickselect(int unique[],int start,int end,HashMap<Integer,Integer> h,int k)
    {
        if(start>=end)
            return;
        int pi=partition(unique,start,end,h);
        if(pi==k)
            return;
        else if(pi>k)
        {
             Quickselect(unique,start,pi-1,h,k);
        }
        else if(pi<k)
             Quickselect(unique,pi+1,end,h,k);
    }
    public int partition(int unique[],int start,int end,HashMap<Integer,Integer> h)
    {
        int mid=(start+end)/2;
        int pivot=h.get(unique[mid]);
        swap(unique,mid,end);
        int i=start-1;
        for(int j=start;j<end;j++)
        {
           if(h.get(unique[j])<pivot)
           {
               i++;
               swap(unique,i,j);
           }
        }
        swap(unique,i+1,end);
        return i+1;
        
    }
    public void swap(int unique[],int start,int end)
    {
        int temp=unique[start];
        unique[start]=unique[end];
        unique[end]=temp;
    }
}