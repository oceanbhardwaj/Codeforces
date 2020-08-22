import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++)
        {
            String s=sc.nextLine();
        
        if(!isPalindrome(s))
        {
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String g=String.valueOf(ch);
            System.out.println(g);
        }
        else
        {
            System.out.println("-1");
        }

        }

    }
    static boolean isPalindrome(String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
