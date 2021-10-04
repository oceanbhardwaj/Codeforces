class Solution {
    class Pair
    {
        char ch;
        int i;
        public Pair(char ch,int i)
        {
            this.ch=ch;
            this.i=i;
        }
    }
    public String minRemoveToMakeValid(String s) {
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
           
             if(!st.isEmpty() && s.charAt(i)==')' && st.peek().ch=='(')
                st.pop();
            else if(s.charAt(i)=='(' ||s.charAt(i)==')')
                st.push(new Pair(s.charAt(i),i));
        }
        HashSet<Integer> a=new HashSet<>();
        while(!st.isEmpty())
        {
            a.add(st.pop().i);
        }
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(a.contains(i))
                continue;
            res=res+s.charAt(i);
        }
        return res;
        
    }
}