/*class Solution {
    public String largestMerge(String word1, String word2) {
        PriorityQueue<String> pq=new PriorityQueue<>((o1,o2)->o2.compareTo(o1));
        pq.add(word1);
        pq.add(word2);
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty())
        {
            String str=pq.poll();
            sb.append(str.charAt(0));
            str=str.substring(1);
            if(str.length()!=0)
                pq.add(str);
        }
        return sb.toString();
        
    }
}*/

class Solution {
    public String largestMerge(String word1, String word2) {
      if(word1.length()==0 || word2.length()==0)
          return word1+word2;
        if(word2.compareTo(word1)>=0)
            return word2.charAt(0)+largestMerge(word1,word2.substring(1));
        return word1.charAt(0)+largestMerge(word1.substring(1),word2);
        
        
        
    }
}