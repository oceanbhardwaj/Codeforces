class Solution {
    public int[] constructDistancedSequence(int n) {
        int ans[]=new int[n*2-1];
        boolean visited[]=new boolean[n+1];
        call(0,ans,visited,n);
        return ans;
        
    }
    public boolean call(int index,int ans[],boolean visited[],int n)
    {
        if(index==ans.length)
            return true;
        if(ans[index]!=0)
        { return call(index+1,ans,visited,n);
        }  
        else{
        for(int i=n;i>=1;i--)
        {
            if(visited[i])
                continue;
            
            ans[index]=i;
            visited[i]=true;
            if(i==1)
            { if( call(index+1,ans,visited,n))
                return true;
                    
        }
            
               else if(index+i<ans.length && ans[index+i]==0)
                {
                    ans[index+i]=i;
                    if(call(index+1,ans,visited,n))
                        return true;
                    ans[index+i]=0;
                }
                ans[index]=0;
                visited[i]=false;
            }
        }
        return false;
    }
}