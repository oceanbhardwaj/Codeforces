class Solution {
    int max=0;
    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        int n=students.length;
        boolean visited[]=new boolean[n];
        helper(students,mentors,0,0,visited);
        return max;
        
        
        
    }
    public void helper(int students[][],int mentors[][],int pos,int score,boolean visited[])
    {
        if(pos>=students.length)
        {
             max=Math.max(score,max);
            return;
        
        }
        for(int i=0;i<mentors.length;i++)
        {
            if(!visited[i])
            {
                visited[i]=true;
                helper(students,mentors,pos+1,score+findMatch(students[pos],mentors[i]),visited);
                visited[i]=false;
            }
        }
    
    
    }
    public int findMatch(int a[],int b[])
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==b[i])
                count++;
        }
        return count;
    }
}