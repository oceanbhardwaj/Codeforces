class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            h.put(arr[i],i);
        }
        for(int p[]:pieces)
        {
            if(!h.containsKey(p[0]))
                return false;
            int idx=h.get(p[0]);
            h.remove(p[0]);
            for(int i=1;i<p.length;i++)
            {
                if(!h.containsKey(p[i]) || (idx+1!=h.get(p[i])))
                    return false;
                h.remove(p[i]);
                idx++;
            }
        }
        return true;
    }
}