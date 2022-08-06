import java.util.Scanner;    
public class q7 {    
     public static void main(String args[])
     {       
           String s = "1 fish 2 fish red fish blue fish";          
           Scanner in = new Scanner(s).useDelimiter("\\s*fish\\s*");       
           System.out.println(in.nextInt());   // prints: 1  
           System.out.println(in.nextInt());   // prints: 2  
           System.out.println(in.next());      // prints: red  
           System.out.println(in.next());      // prints: blue          
           in.close();       
    }    
}     
