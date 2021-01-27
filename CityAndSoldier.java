
import java.util.*;
class TestClass {
   static int size[];
   static int parent[];
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int q=sc.nextInt();
       parent=new int[n+1];
       size=new int[n+1];
       Arrays.fill(size,1);
       for(int i=1;i<=n;i++)
       {
parent[i]=i;
       }
       for(int i=0;i<q;i++)
       {
           int t=sc.nextInt();
           if(t==1)
           {
               union(sc.nextInt(),sc.nextInt());
           }
           else if(t==2)
           { int a=sc.nextInt();
               int p=find(a);
              parent[p]= parent[a]=a;
           }
           else
           { int a1=sc.nextInt();
            System.out.println(find(a1));
           }
       } 
    }
    public static void union(int x,int y)
    {
        int fx=find(x);
        int fy=find(y);
        if(fx==fy)
        return;
       parent[fx]=fy;
        
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
