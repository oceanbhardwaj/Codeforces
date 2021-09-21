class Solution {
    public int[] findOriginalArray(int[] changed) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int ans[]=new int[changed.length/2];
        if(changed.length%2==1)
            return new int[0];
        for(int i:changed)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        Arrays.sort(changed);
        int index=0;
        for(int i=0;i<changed.length;i++)
        {
            if(changed[i]==0 && h.get(0)>=2)
            {
                 System.out.println("index");
                h.put(0,h.get(0)-2);
                ans[index++]=changed[i];
            }
            else if( changed[i]!=0 && h.containsKey(changed[i]) && h.get(changed[i])>0 &&   h.containsKey(changed[i]*2) && h.get(changed[i]*2) >0)
            {
                 System.out.println("indexcc");
                h.put(changed[i],h.get(changed[i])-1);
                ans[index++]=changed[i];
                h.put(changed[i]*2,h.get(changed[i]*2)-1);
            }
                
        }
        System.out.println(index);
        if(index==changed.length/2)
        {
            return ans;
        }
        return new int[0];
    }
}