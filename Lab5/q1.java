import java.util.Scanner;

public class q1 {

    public static int countryTotal (String countryName,  int[][] medalTally, String[] countries)
    {
        int i=0, total=0;
        for (String s : countries )
        {
            if(s.equals(countryName))
            total=medalTally[i][0]+medalTally[i][1]+medalTally[i][2];
            i++;
        }
        return total;
    }

    public static int medalTotal (String medalType, int[][] medalTally, String[] countries, int i)
    {
        int type=0;
        if (medalType.equals("Gold"))
        type=0;
        else if (medalType.equals("Silver"))
        type=1;
        else if (medalType.equals("Bronze"))
        type=2;
        return medalTally[i][type];
    }

    public static int position (int[][] medalTally, String[] countries, String countryName)
    {
        int i=0, pos=0;
        for (String s : countries )
        {
            if(s.equals(countryName))
            pos=i+1;
            i++;
        }
        return pos;
    }

    public static void swap(int a, int b, int x, int[][]A)
    {
        int temp;
        temp=A[a][x];
        A[a][x]=A[b][x];
        A[b][x]=temp;
    }

    public static void swap(int a, int b, String[] S)
    {
        String temp;
        temp=S[a];
        S[a]=S[b];
        S[b]=temp;
    }

    public static void sortPosition(String[] S, int[][] A, int n)
    {
        int i,j;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(A[i][0]<A[j][0])
                {
                    swap(i,j,0,A);
                    swap(i,j,1,A);
                    swap(i,j,2,A);
                    swap(i,j,S);
                }
                else if(A[i][0]==A[j][0] && A[i][1]<A[j][1])
                {
                    swap(i,j,0,A);
                    swap(i,j,1,A);
                    swap(i,j,2,A);
                    swap(i,j,S);                    
                }
                else if(A[i][0]==A[j][0] && A[i][1]==A[j][1] && A[i][2]<A[j][2])
                {
                    swap(i,j,0,A);
                    swap(i,j,1,A);
                    swap(i,j,2,A);
                    swap(i,j,S);                    
                }
            }
        }
    }

    public static void print(String[] names,int medals[][],int[] total, int n)
    {
        int i;
        System.out.println(String.format("\n%s %s %s %s %s %s","Position"," Country ","  Gold "," Silver "," Bronze "," Total"));
        for(i=0;i<n;i++)
        {
            System.out.print(String.format("%4d",(i+1)));
            System.out.print(String.format("       %-5s",names[i]));
            System.out.println(String.format("%7d %7d %7d %10d",medals[i][0],medals[i][1],medals[i][2],total[i]));
        }
    }




    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, i;
        System.out.print("Enter no: of countries: ");
        n=in.nextInt();

        String[] names = new String[n];
        int[][] medals = new int[n][3];
        for(i=0;i<n;i++)
        {
            System.out.print("\nEnter name of country-"+(i+1)+"   : ");
            names[i]=in.next();
            System.out.print("Enter no:of gold medals   : ");
            medals[i][0]=in.nextInt();
            System.out.print("Enter no:of silver medals : ");
            medals[i][1]=in.nextInt();
            System.out.print("Enter no:of bronze medals : ");
            medals[i][2]=in.nextInt();
        }
        sortPosition(names,medals,n);
        
        int[]total=new int[n];
        for(i=0;i<n;i++)
        total[i]=countryTotal(names[i], medals, names);
        print(names,medals,total,n);
        
        int ch, c;
        String s, type="";
        while(true)
        {
            System.out.println("\n1.Countrywise total  2.Medalwise total  3.Country position  4.Exit");
            System.out.print("Enter your choice: ");
            ch=in.nextInt();
            if(ch==1)
            {
                System.out.print("Enter country name: ");
                s=in.next();
                System.out.println("Total medals for "+s+" : "+countryTotal(s, medals, names));
            }
            else if(ch==2)
            {
                System.out.println("1.Gold  2.Silver  3.Bronze");
                System.out.print("Enter Medal Type name: ");
                c=in.nextInt();
                if(c==1)
                type="Gold";
                else if(c==2)
                type="Silver";
                else if(c==3)
                type="Bronze";
                System.out.println(String.format("\n%s %s"," Country    ",type));
                for(i=0;i<n;i++)
                {
                    System.out.print(String.format("  %5s",names[i]));
                    System.out.println(String.format(" %7d",medalTotal (type, medals, names,i)));
                }
            }
            if(ch==3)
            {
                System.out.print("Enter country name: ");
                s=in.next();
                System.out.println("Position of "+s+" : "+position (medals, names, s));
            }
            else if(ch==4)
            break;
        }
    }
}