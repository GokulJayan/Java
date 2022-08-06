import java.util.Scanner;

public class q3 {

    public static void showCount(int[] count,int n, int spoilt)
    {
        int i;
        System.out.println("Candidate     Votes");
        for(i=0;i<n;i++)
        System.out.println(String.format("%s-%d %5d","Candidate",(i+1),count[i]));
        System.out.println(String.format("%s %10d","Spoilt",spoilt));
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, i, ch, vote;
            
        System.out.print("Enter no: of candidates: ");
        n=in.nextInt();
        int[] count=new int[n];
        int spoilt=0;
        for(i=0;i<n;i++)
        count[i]=0;

        while(true)
        {
            System.out.println("\n1.Cast Vote  2.Show Count  3.Exit");
            System.out.print("Enter your choice: ");
            ch=in.nextInt();
            if(ch==1)
            {
                System.out.print("Enter your choice from (1 to "+n+"): ");
                vote=in.nextInt();
                if(vote>=1 && vote<=n)
                count[vote-1]++;
                else
                spoilt++;
            }
            else if(ch==2)
            showCount(count,n,spoilt);
            else if(ch==3)
            break;
        }
    }
}