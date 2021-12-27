class Solution {
    public long[] getDistances(int[] arr) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
             map.putIfAbsent(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        
        }
        System.out.println(map);
        long output[]=new long[arr.length];
        //left
        //left=i*num-(presum-num);
        //right=(sum-presum)-(size-i-1)*num
        for(int l:map.keySet())
        {long sum=0;
         ArrayList<Integer> list=map.get(l);
         for(int j:list)
             sum=sum+j;
         long presum=0;
        for(int i=0;i<list.size();i++)
        {
          
        int num=list.get(i);
              presum=presum+num;
        long left=i*(long)num-(presum-(long)num);
            long right=(sum-presum)-(list.size()-i-1)*(long)num;
            output[num]=left+right;
           // output[num] = sum + (2*i+2-list.size())*(long)num - 2*presum;
        
        }
         
        
        
        
        }
        return output;
        
    }
}