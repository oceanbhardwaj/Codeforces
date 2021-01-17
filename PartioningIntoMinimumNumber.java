class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++)
        {
            max=Math.max(n.charAt(i)-'0',max);
        }
        return max;
    }
}


8 2 7 3 4
1 1 1 1 1
1 1 1 1 1
1 0 1 1 1
1 0 1 0 1
1 0 1 0 0
1 0 1 0 0
1 0 1 0 0
1 0 0 0 0
    
    8=max