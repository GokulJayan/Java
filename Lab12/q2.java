import java.util.*;

public class q2 {

    public static float mode(float[]Ar, int n)
    {
        int i,j,count,max=0;
        float f=0;
        for(i=0;i<n-1;i++)
        {
            count=0;
            for(j=i+1;j<n;j++)
            {
                if(Ar[i]==Ar[j])
                count++;
            }
            if(count>max)
            {
                max=count;
                f=Ar[i];
            }
        }
        return f; 
    } 

    public static double sd(float mean, float[]Ar, int n)
    {
        float sDev=0;
        for(int i=0;i<n;i++) 
        sDev += Math.pow(Ar[i] - mean, 2);

        return Math.sqrt(sDev/n);
    } 

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i,n=5;
        float f,total=0;
        float[] Ar = new float[n];
        ArrayList <Float> list = new ArrayList <Float> ();
        System.out.println("Enter "+n+" Floating point values: ");
        for(i=0;i<n;i++)
        {
            f=in.nextFloat();
            list.add(f);
        }
        Iterator itr = list.iterator();
        i=0;
        while(itr.hasNext())
        {
            f=(float)itr.next();
            total+=f;
            Ar[i++]=f;
        }
        float mean=total/n;
        System.out.println("\nMean = "+mean);
        System.out.println("Mode = "+mode(Ar,n));
        System.out.println("SD   = "+sd(mean,Ar,n));
    }    
}
