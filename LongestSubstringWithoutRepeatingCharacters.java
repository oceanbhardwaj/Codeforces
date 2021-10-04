class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            HashMap<Character,Integer> h=new HashMap<>();
            for(int j=i;j<s.length();j++)
            {
                if(!h.containsKey(s.charAt(j)))
                {
                   h.put(s.charAt(j),1); 
                }
                else
                {
                        break;
                
                }
                max=Math.max(h.size(),max);
            }
        }
        return max;
    }
}
/////////////////////////////////////////
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h=new HashSet<>();
        int left=0;
        int max=0;
        for(int j=0;j<s.length();)
        {
            if(!h.contains(s.charAt(j)))
            {h.add(s.charAt(j++));
             max=Math.max(max,h.size());
            }
            else
            {
                h.remove(s.charAt(left));
                left++;
            }
        }
            return max;
    }
}