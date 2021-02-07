class Solution {
    public int maximumScore(int a, int b, int c) {
       int count=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((o1,o2)->o2-o1);
        pq.add(a);
        pq.add(b);
        pq.add(c);
        while(pq.size()>=2)
        {
            int s1=pq.poll();
            int s2=pq.poll();
            count++;
            s1--;
            s2--;
            if(s1!=0)
                pq.add(s1);
            if(s2!=0)
                pq.add(s2);
        }
        return count;
        
    }
}