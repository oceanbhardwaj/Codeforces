class Solution {
    public int[] decode(int[] encoded) {
        int total_XOR=0;
        int n=encoded.length+1;
        for(int i=1;i<=n;i++)
        {
            total_XOR=total_XOR^i;
        }
        int xor=0;
        for(int i=1;i<n-1;i++)
        {
            if(i%2==1)
                xor=xor^encoded[i];
        }
        
        int first_number=total_XOR ^xor;
        int arr[]=new int[n];
        arr[0]=first_number;
        for(int i=1;i<n;i++)
        {
            arr[i]=arr[i-1]^encoded[i-1];
        }
        return arr;
    }
}