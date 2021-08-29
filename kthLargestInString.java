import java.math.BigInteger;  
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Comparator co=new Comparator<String>()
        {
            public int compare(String a,String b)
            {
                BigInteger a1=new BigInteger(a);
                BigInteger b1=new BigInteger(b);
                return b1.compareTo(a1);    
                
            }
        };
       Arrays.sort(nums,co);
        for(int i=0;i<nums.length;i++)
        {
System.out.println(nums[i]+ "");}
        System.out.println();
        return nums[k-1];
    }
}