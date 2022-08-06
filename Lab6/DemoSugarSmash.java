import java.util.Scanner;

class SugarSmashPlayer 
{
    int ID;
    String sname;
    int[] score=new int[100];
    int Level;

    Scanner in=new Scanner(System.in);

    SugarSmashPlayer()
    {
        ID=0;
        sname=null;
        for(int i=0;i<10;i++)
        score[i]=-1;
    }

    void setID(int ID)
    {
        System.out.print("Enter player ID: ");
        this.ID=in.nextInt();
    }
    void setsname(String snam)
    {
        System.out.print("Enter screen name: ");
        this.sname=in.next();
    }    
    int setscore(int Level, int Score)
    {
        int flag=0;
        Level=in.nextInt();
        if(Level>=1 && Level<=10)
        {
            if(Level==1)
            {
                System.out.print("Enter Score: ");
                score[Level-1]=in.nextInt();
            }
            else
            {
                if(score[Level-1-1]>=100)
                {
                    System.out.print("Enter Score: ");
                    score[Level-1]=in.nextInt();
                }
                else
                {
                    System.out.println("Not enough points for next level. Kindly Enter again!");
                    flag=1;
                }
            }
        }
        else
        {
            System.out.println("Invalid Game Level. Kindly Enter again!");     
            flag=1;
        }  
        if(flag==1)
        return -1;
        else
        return 0;
    }

    int getID()
    {
        return ID;
    }
    String getsname()
    {
        return sname;
    }    
    int getscore(int Level)
    {
        if(Level>=1 && Level<=10)
        return score[Level-1];
        else
        {
            System.out.println("Invalid Game Level");    
            return -1;
        }
    }

    void display()
    {
        int s;
        System.out.println("\nPlayer ID  : "+getID());
        System.out.println("Screen Name  : "+getsname());
        System.out.println();
        for(int i=0;i<10;i++)
        {
            s=getscore(i+1);
            if(i==9 && s!=-1)
            System.out.println("Level-"+(i+1)+" : "+s);
            else if(i>=0 && s!=-1)
            System.out.println("Level-"+(i+1)+"  : "+s);
        }
    }
}

class PremiumSugarSmashPlayer extends SugarSmashPlayer
{
    PremiumSugarSmashPlayer(int id, String name, int A[])
    {
        this.ID=id;
        this.sname=name;
        for(int i=0;i<10;i++)
        this.score[i]=A[i];
        for(int i=10;i<50;i++)
        score[i]=-1;
    }

    int Psetscore(int Level, int Score)
    {
        int flag=0;
        Level=in.nextInt();
        if(Level>=11 && Level<=50)
        {
            if(score[Level-1-1]>=100)
            {
                System.out.print("Enter Score: ");
                score[Level-1]=in.nextInt();
            }
            
            else
            {
                System.out.println("Sorry Not enough points for next level. Kindly Enter again!");
                flag=1;
            }
        }
        else
        {
            System.out.println("Invalid Game Level. Kindly Enter again!");     
            flag=1;
        }  
        if(flag==1)
        return -1;
        else
        return 0;
    }    
    
    int Pgetscore(int Level)
    {
        if(Level>=11 && Level<=50)
        return score[Level-1];
        else
        {
            System.out.println("Invalid Game Level");    
            return -1;
        }
    }

    void Pdisplay()
    {
        display();
        int s;
        for(int i=10;i<50;i++)
        {
            s=Pgetscore(i+1);
            if(s!=-1)
            System.out.println("Level-"+(i+1)+" : "+s);
        }
    }
}

public class DemoSugarSmash
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,stat,ch=0;
        
        SugarSmashPlayer s1=new SugarSmashPlayer();
        s1.setID(s1.ID);
        s1.setsname(s1.sname);
        System.out.println();
        for(i=0;i<10;i++)
        {
            if(i==0)
            System.out.print("Enter Level: ");
            else
            {
                System.out.println("1.Next Level  2.Exit");
                System.out.print("Enter your choice: ");
                ch=in.nextInt();
                if(ch==1)
                System.out.print("Enter Level: ");
                else
                break;
            }
            stat=s1.setscore(i+1,s1.score[i]);
            if(stat==-1 && i==1)
            i=i-2;
            else if(stat==-1)
            i--;
        }
        s1.display();


        //Premium Account
        System.out.println("\n\n1.Pay $2.99 and get Premium Access  2.Exit");
        System.out.print("Enter your choice: ");
        int choice=in.nextInt();
        if(ch==2 || choice==2)
        {
            System.out.println("Not enough points in first 10 levels");
            System.exit(0);
        }
        
        PremiumSugarSmashPlayer s2=new PremiumSugarSmashPlayer(s1.ID, s1.sname, s1.score);
                
        for(i=10;i<50;i++)
        {
            if(i==10)
            System.out.print("Enter Level: ");
            else
            {
                System.out.println("1.Next Level  2.Exit");
                System.out.print("Enter your choice: ");
                ch=in.nextInt();
                if(ch==1)
                System.out.print((i+1)+"Enter Level: ");
                else
                break;
            }
            stat=s2.Psetscore(i+1,s2.score[i]);
            if(stat==-1)
            i--;
        }
        s2.Pdisplay();
    }
}
