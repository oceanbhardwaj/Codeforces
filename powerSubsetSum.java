import java.util.*;
class TestClass {
    static long temp=0;
    static long ans=0;
    public static void main(String args[] ) throws Exception {
     Scanner sc=new Scanner(System.in);
     long arr[]=new long[10000000];
     long base=1;
     for(int i=0;i<10000000;i++)
     {
         arr[i]=base;
         base=base*3;

     }
    
     long q=sc.nextLong();
     for(int i=0;i<q;i++)
     {
         long n=sc.nextLong();

     
     ArrayList<Long> a=new ArrayList<>();
     ArrayList<Long> a1=new ArrayList<>();
     while(n>0)
     {
         long d=n%2;
         a.add(d);
         n=n/2;
     }
     int i1=0;
    
     for(long h:a)
     {
         if(h==1)

         {  
             a1.add(arr[i1]);
         }
         i1++;

     }
     System.out.println(a1.size());
     for(long g:a1)
     {
         System.out.print(g +" ");
        
     }
 System.out.println();
    }}
    
    // static long pow(long x,long y)
    // {
    //     if(y==1)
    //     return x;
    //     if(y==0)
    //     return 1;
    //     if(y%2==0)
    //     {
    //          temp=pow(x,y/2);
    //         ans=temp*temp;
    //     }
    //     else
    //     {
    //         temp=pow(x,(y-1)/2);
    //         ans=temp*3*temp;
    //     }
    //     return ans;
    // }
    
    
    
    
    
    
    
}
