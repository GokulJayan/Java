import java.util.Scanner;

public class q3{

    public static String reverseString(String str)
    {
        String rev="";
        char ch;
        for (int i=str.length()-1; i>=0; i--)
        {
            ch= str.charAt(i);
            rev+=ch; 
        }
        return rev;        
    }

    public static boolean isPalindrome(String s){             
        if(s.equals((reverseString(s))))
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,i,c=0;
        System.out.print("Enter no of words: ");
        n=in.nextInt();
        String words[]=new String[n];
        System.out.print("Enter "+n+" words: ");
        for(i=0;i<n;i++)
        words[i]=in.next();
        System.out.println();
        for(i=0;i<n;i++)
        {
            if(isPalindrome(words[i]))
            {
                c++;
                System.out.println(words[i]+" is Palindrome (Reverse: "+reverseString(words[i])+")");
            }
        }
        if(c>0)
        System.out.println("\nNo of plaindrome words: "+c);
        else
        System.out.println("\nNo plaindrome words found");
    }
}
