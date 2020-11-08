class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(char i:h.keySet())
        {
            pq.offer(h.get(i));
        }
        HashSet<Integer> h1=new HashSet<>();
        int count=0;
        while(!pq.isEmpty())
        {
            int d=pq.remove();
            if(!h1.contains(d))
                h1.add(d);
            else
            {
                while(h1.contains(d)==true)
                {
                    d--;
                    
                    count++;
                    if(d==0)
                        break;
                }
                h1.add(d);
                
                
                
                
                
            }
        }
        return count;
        
    }
}