class Solution {
    public int findTheWinner(int n, int k) {
        int j=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            a.add(i);
        }
        while(a.size()>1)
        {
            int d=(j+k-1)%a.size();
            a.remove(d);
            j=d;
        }
        return a.get(0);
    }
}