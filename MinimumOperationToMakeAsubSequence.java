///////////////////////////////////////////////////////using lcs////////////////////////////////////////////////////////////////////////////////
/*class Solution {
    public int minOperations(int[] target, int[] arr) {
        int n=target.length;
        int m=arr.length;
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(arr[i-1]==target[j-1])
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        int lcs=dp[m][n];
        return n-lcs;
        
    }
}*/
/////////////////////////////////////////////////////////////////////////////using lis o(n2)///////////////////////////////////////////////////////
/*class Solution {
    public int minOperations(int[] target, int[] arr) {
        int n=target.length;
        int m=arr.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            h.put(target[i],i);
        }
        for(int i=0;i<m;i++)
        {
            if(h.containsKey(arr[i]))
                arr[i]=h.get(arr[i]);
            else
                arr[i]=Integer.MAX_VALUE;
        }
        //lis
        int max=0;
        int lis[]=new int[m];
        Arrays.fill(lis,1);
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j] && lis[j]>=lis[i] && arr[i]!=Integer.MAX_VALUE)
                {lis[i]=lis[j]+1;
                 max=Math.max(lis[i],max);}
            }
        }
        if(max==0 && m>n)
            return n-1;
        return (max==0 && n>m)?n:n-max;
    }
}*/
//////////////////////////////////////using lis o(nlogn)////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
     ArrayList<Integer> a=new ArrayList<>();
    public int minOperations(int[] target, int[] arr) {
      
        int n=target.length;
        int m=arr.length;
          if(n>m)
            return n;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            h.put(target[i],i);
        }
        for(int i=0;i<m;i++)
        {
            if(h.containsKey(arr[i]))
                arr[i]=h.get(arr[i]);
            else
                arr[i]=Integer.MAX_VALUE;
        }
        //lis using nlogn
       
        a.add(arr[0]);
        int jindex=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==Integer.MAX_VALUE || arr[i]==a.get(jindex))
                continue;
            if(arr[i]>a.get(jindex))
            { a.add(arr[i]);
             jindex++;}
            else
            {
                int index=BinarySearchCeil(a,arr[i]);
                a.set(index,arr[i]);
            }
        }
        return n-a.size();
        
        
        
        
        
        
    }
    
    public int BinarySearchCeil(ArrayList<Integer> a, int target)
    {
        int left=0;
        int right=a.size()-1;
        int ans=-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(a.get(mid)>=target)
            {ans=mid;
             right=mid-1;}
            else if(a.get(mid)<target)
            {
                left=mid+1;
            }
                
            
                
        }
        return ans;
    }
}


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  