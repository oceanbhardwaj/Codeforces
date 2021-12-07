class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> h=new HashMap<>();
        ArrayList<Integer> aa=new ArrayList<>();
        for(int i:digits)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i=100;i<1000;i++)
        {
            String str=String.valueOf(i);
            int a=Integer.parseInt(str.charAt(0)+"");
             int b=Integer.parseInt(str.charAt(1)+"");
             int c=Integer.parseInt(str.charAt(2)+"");
            HashMap<Integer,Integer> h1=new HashMap<>();
             h1.put(a,h1.getOrDefault(a,0)+1);
             h1.put(b,h1.getOrDefault(b,0)+1);
             h1.put(c,h1.getOrDefault(c,0)+1);
            
            if(h.containsKey(a) && h.containsKey(b) &&h.containsKey(c) && h1.containsKey(a) && h1.containsKey(b)&& h1.containsKey(c)  && h.get(a)>=h1.get(a) && h.get(b)>=h1.get(b) && h.get(c)>=h1.get(c))
            {
                System.out.println(i);
                if((i%2)==0)
                { aa.add(i);
                 System.out.println("c: "+i);
                 
                }
            }
        }
        int arr[]=new int[aa.size()];
        for(int i=0;i<aa.size();i++)
        {
            arr[i]=aa.get(i);
        }
        return arr;    
    }
}