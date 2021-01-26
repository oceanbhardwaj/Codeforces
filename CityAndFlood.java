import java.util.*;
import java.io.*;
class TestClass {
  static  int parent[];
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
        parent=new int[n+1];
        for(int i=1;i<=n;i++)
        {
         parent[i]=i;
        }
       for(int i=0;i<k;i++)
       {
           int a=sc.nextInt();
           int b=sc.nextInt();
           union(a,b);
       }
       int count=0;
       for(int i=1;i<=n;i++)
       {
          if(parent[i]==i)
          count++;
       }
       System.out.println(count);
    }
    public static void union(int a,int b)
    {
        int fx=find(a);
        int fy=find(b);
        if(fx==fy)
        return;
        parent[fy]=fx;
    }
    public static int find(int node)
    {
        if(parent[node]==node)
        return node;
        int p=find(parent[node]);
        return parent[node]=p;
    }
}
