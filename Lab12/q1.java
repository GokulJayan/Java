import java.util.*;

public class q1{

    public static boolean isPalindrome(String s)
    {
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        rev+=s.charAt(i);
        if(s.equals(rev))
        return true;
        else
        return false;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i;
        String s;
        ArrayList <String> words = new ArrayList<String> ();
        System.out.print("Enter n: ");
        int n=in.nextInt();
        System.out.println("\nEnter "+n+" words: ");
        for(i=0;i<n;i++)
        {
            s=in.next();
            words.add(s);
        }
        Iterator itr= words.iterator(); 
        System.out.println("\nPalindrome Words: ");
        while(itr.hasNext())
        {
            s=(String) itr.next();
            if(isPalindrome(s))
            System.out.println(s);
        }
    }
}