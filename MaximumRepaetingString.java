class Solution {
    public int maxRepeating(String sequence, String word) {
        int n=word.length();
        if(sequence.equals(word))
            return 1;
        int count=0;
        int max=0;
        for(int i=0;i<=sequence.length()-word.length();i++)
        {
            String s=sequence.substring(i,i+n);
            
            if(s.equals(word))
            { count++;
             i=i+n-1;}
            else
                count=0;
           
            max=Math.max(max,count);
        }
        return max;
        
    }
}