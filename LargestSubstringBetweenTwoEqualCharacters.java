class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!h.containsKey(s.charAt(i)))
                h.put(s.charAt(i),i);
            else
            {
                int d=h.get(s.charAt(i));
                max=Math.max(max,i-(d+1));
                
            }
        }
        return max;
    }
}