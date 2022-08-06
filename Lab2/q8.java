import java.util.Scanner;

public class q8
{
    public static void main (String args[])
    {    
        Scanner in = new Scanner(System.in);
        
        //String s1="Virat";
        //String s2="Kohli";
        //String s4="Nice";
        //String s1="Java is avesome";
        //s1=s1.replace("av","xy");
        //String s3=String.join("",s1,s2,"is","no:1");
        //int s2=s1.lastIndexOf('i');
       // char x=s1.charAt(2);
        //System.out.println(s1);

        //String s1="one-two-three-four-five-six";  
        //String[] words=s1.split("-",2);//splits the string based on whitespace  
        //using java foreach loop to print elements of string array  
        //for(String w:words){  
        //System.out.println(w);  
        //}  
        //System.out.println(words.length);
        //String s="a";
        //char c=s.charAt(0);
        //System.out.println(c);
        
        float result=29.5789383f;
        double res=(double)result;
        //result = Math.round(result*Math.pow(10,2))/Math.pow(10,2);
        res = Math.round(res * 10.00) / 10.00;
        System.out.println(res);

    }
}