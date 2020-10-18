class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        
        int dp[][]=new int[scores.length][2];
        for(int i=0;i<scores.length;i++)
        {
            dp[i][0]=ages[i];
            dp[i][1]=scores[i];
            
        }
        Comparator co=new Comparator<int[]>(){
            public int compare(int a[],int b[])
            {
                if(a[0]==b[0])
                    return a[1]-b[1];
                return a[0]-b[0];
            }
            
            
        };
        Arrays.sort(dp,co);
        
        for(int i=0;i<scores.length;i++)
        {
            scores[i]=dp[i][1];
        }
        
        
        
        
        
        
        
        int arr[]=new int[scores.length];
        for(int i=0;i<scores.length;i++)
        {
            arr[i]=scores[i];
        }
        for(int i=1;i<scores.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(scores[i]>=scores[j] && arr[i]<arr[j]+scores[i])
                    arr[i]=arr[j]+scores[i];
            }
        }
        int max=0;
        for(int i=0;i<scores.length;i++)
        {
            max=Math.max(arr[i],max);
        }
        return max;
    }
}