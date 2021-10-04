class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0;
        for(int i:rolls)
            sum=sum+i;
        
        // if(sum%rolls.length!=0)
           // return new int[0];
        
        int arr[]=new int[n];
        int d=mean*(rolls.length+n)-sum;
        int mod=(mean*(rolls.length+n)-sum)%n;
         if(d>6*n || d<n)
           return new int[0];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=d/n;
        }
       for(int i=0;i<mod;i++)
       {
           arr[i]++;
       }
        return arr;
    }
}