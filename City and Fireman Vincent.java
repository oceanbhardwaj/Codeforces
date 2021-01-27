
import java.util.*;
class TestClass {
   static int parent[];
   static int size[];
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int arr[]=new int[n];
        parent=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++)
        parent[i]=i;
        Arrays.fill(size,1);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            union(a,b);

        }
        int mod=(int)1000000007;
        HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            h.putIfAbsent(find(i),new ArrayList<>());
            h.get(find(i)).add(arr[i]);
        }
        
        int max=1;
        ArrayList<Integer> aa=new ArrayList<>();
       for(int ele:h.keySet())
       {
           ArrayList<Integer> l1=h.get(ele);
           Collections.sort(l1);
           int inn=l1.get(0);
           int count=0;
           for(int in:l1)
           {
               if(inn==in)
               count++;
           }
           aa.add(count);
           
       }
       
       for(int ee:aa)
       {
           max=(max*ee)%mod;
       }

    System.out.println(max);


        

    }
    public static void union(int a,int b)
    {
        int fx=find(a);
        int fy=find(b);
        if(fx==fy)
        return;
        if(size[fx]<size[fy])
        {
            parent[fx]=fy;
            size[fy]+=size[fx];
        }
        else
        {
            parent[fy]=fx;
            size[fx]+=size[fy];
        }
    }
    public static int find(int node)
    {
        while(parent[node]!=node)
        {
            parent[node]=parent[parent[node]];
            node=parent[node];
        }
        return node;
    }
}
