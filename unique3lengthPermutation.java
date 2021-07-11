class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,ArrayList<Integer>> h=new HashMap<>();
        HashSet<Character> last= new HashSet<>();
        HashSet<Character> mid= new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {  h.putIfAbsent(s.charAt(i),new ArrayList<>());
           h.get(s.charAt(i)).add(i);
        }
        char ch[]=s.toCharArray();
        for(char c:h.keySet())
        {
            ArrayList<Integer> res=h.get(c);
            mid= new HashSet<>();
            if(res.size()>1)
            {
                int first=res.get(0);
                int l=res.get(res.size()-1);
                for(int i=first+1;i<l;i++)
                {
                    mid.add(ch[i]);
                }
                count=count+mid.size();
            }
        }
        return count;
        
    }
}