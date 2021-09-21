class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> prev=new ArrayList<>();
        prev.add(1);
        for(int i=1;i<=rowIndex;i++)
        {
            ArrayList<Integer> next=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    next.add(1);
                else
                    next.add(prev.get(j-1)+prev.get(j));
                
                    
            }
            prev=next;
        }
        return  prev;
    }
}