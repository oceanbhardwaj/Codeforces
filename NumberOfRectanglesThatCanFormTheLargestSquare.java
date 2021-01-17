class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> a1=new ArrayList<>();
        for(int a[]:rectangles)
        {
            a1.add(Math.min(a[0],a[1]));
            max=Math.max(max,Math.min(a[0],a[1]));
        }
        int count=0;
        for(int i:a1)
        {
            if(i>=max)
                count++;
        }
        return count;
    }
}