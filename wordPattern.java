class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> h=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        String str[]=s.split(" ");
        if(str.length!=pattern.length())
            return false;
        for(int i=0;i<str.length;i++)
        {
            if(!set.contains(pattern.charAt(i)) && !h.containsKey(str[i]))
            {
                    h.put(str[i],pattern.charAt(i));
                set.add(pattern.charAt(i));
            
            }
            else if(set.contains(pattern.charAt(i)) || h.containsKey(str[i]))
            {
                if(h.containsKey(str[i]) && h.get(str[i])!=pattern.charAt(i))
                {
                  return false;
                 
                }else if(!h.containsKey(str[i]))
                return false;
            }
           
        }
        return true;
    }
}