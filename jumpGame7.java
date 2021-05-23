class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
       int farthest=0;
        while(!q.isEmpty())
        {
            int i=q.poll();
            int start=Math.max(i+minJump,farthest);
            for(int j=start;j<=Math.min(i+maxJump,s.length()-1);j++)
            {
                if(s.charAt(j)=='0')
                {
                    q.add(j);
if(j==s.length()-1)
                    return true;
                }
                
                
            }
            farthest=i+maxJump;
        }
        return false;
    }
}