class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
       
        int ans=h.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--)
        {
            if(h.get(s.charAt(i+1))==h.get(s.charAt(i)))
                 ans=ans+h.get(s.charAt(i));
         else if(ans<h.get(s.charAt(i)))
               ans=ans+h.get(s.charAt(i));
            else
                ans=ans-h.get(s.charAt(i));
        }
        return ans;
    }
}