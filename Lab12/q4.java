import java.util.*;

public class q4{

    public static int count(String str)
    {
        char [] c=new char[str.length()];
        c=str.toCharArray();
        HashSet<Character> hs=new HashSet<Character>();

        for(char x:c)
        hs.add(x);
            
        System.out.println("\nUnique Characters: "+hs);
        return hs.size();
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i;
        System.out.print("Enter a string: ");    
        String s=in.next();
        System.out.println("No:of unique characters: "+count(s));        
    }
}