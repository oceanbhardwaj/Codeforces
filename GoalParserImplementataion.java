class Solution {
    public String interpret(String command) {
        Stack<String> s=new Stack<>();
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
                s.push("G");
            else if(command.charAt(i)==')')
            {
                if(!s.isEmpty() && s.peek().equals("("))
                {
                    s.pop();
                    s.push("o");
                }
                
                    
                    
            }
            else if(!s.isEmpty() && command.charAt(i)=='a' && s.peek().equals("("))
            {
                s.pop();
                s.push("a");
                s.push("l");
                
            }
            else if(command.charAt(i)=='(')
                s.push(command.charAt(i)+"");
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty())
            sb.append(s.pop());
        sb.reverse();
        String s1=sb.toString();
        return s1;
        
    }
}