import java.util.Scanner;
import java.io.*;

class Employee implements Serializable {
    transient Scanner in = new Scanner(System.in);
    public static int c = 101;
    private static final long serialVersionUID = 1L;
    int id;
    String name, dept, desig;

    Employee() {
        id = c;
        System.out.print("\nEnter name : ");
        name = in.next();
        System.out.print("Enter dept : ");
        dept = in.next();
        System.out.print("Enter desig: ");
        desig = in.next();
        c++;
    };

    public String toString() {
        return id + "\t" + name + "\t" + dept + "\t" + desig;
    }
}

public class q6 {

    public static int eno(int ID, Employee[] Emp, int n){
        for(int i=0;i<n;i++)
        {
            if(ID==Emp[i].id)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int i;
        String path = "C:\\java\\employee.txt";
        
        //WRITING
        FileOutputStream f = new FileOutputStream(path); 
        ObjectOutputStream o = new ObjectOutputStream(f);

        System.out.print("Enter no:of records: ");
        int n = in.nextInt();
        Employee[] E = new Employee[n];

        for (i = 0; i < n; i++) {
            E[i]=new Employee();

            o.writeObject(E[i]);
            System.out.println("Record has been added!");
        }
        
        //READING
        FileInputStream fi = new FileInputStream(path); 
        ObjectInputStream oi = new ObjectInputStream(fi);
        Employee [] E1 = new Employee[n];
        System.out.println("\nID\tName\tDept\tDesig");
        for (i = 0; i < n+2; i++) {
            try{
                E1[i] = (Employee) oi.readObject(); 
                System.out.println(E1[i]);
            }catch(Exception e){}
        }
        
        int ch, ID, No;
        String DEPT;
        
        while(true){
            System.out.println("\n1.Display Details   2.Department wise Employees  3.Change Desig  4.Change Dept  5.Exit");
            System.out.print("Enter your choice: ");
            ch=in.nextInt();
            
            if(ch==1)
            {
                System.out.print("\nEnter Employee ID: ");
                ID=in.nextInt();
                No=eno(ID, E1, n);  
                if(No!=-1)
                {
                    System.out.println("\nID\tName\tDept\tDesig");
                    System.out.println(E1[No]);
                }
                else
                System.out.println("Invalid Employee ID!");
            }
            
            else if(ch==2)
            {
                System.out.print("\nEnter Department: ");
                DEPT=in.next();
                System.out.println("\nID\tName");
                for(i=0;i<n;i++)
                {
                    if(E1[i].dept.equals(DEPT))
                    System.out.println(E1[i].id +"\t"+ E1[i].name);
                }
            }

            else if(ch==3)
            {
                System.out.print("\nEnter Employee ID: ");
                ID=in.nextInt();
                No=eno(ID, E1, n);  
                if(No!=-1)
                {
                    System.out.print("Enter new Desig: ");
                    E1[No].desig=in.next();
                    for (i = 0; i < n; i++)
                    o.writeObject(E1[i]);
                }
                else
                System.out.println("Invalid Employee ID!");
            }

            else if(ch==4)
            {
                System.out.print("\nEnter Employee ID: ");
                ID=in.nextInt();
                No=eno(ID, E1, n);  
                if(No!=-1)
                {
                    System.out.print("Enter new Dept: ");
                    E1[No].dept=in.next();
                    for (i = 0; i < n; i++)
                    o.writeObject(E1[i]);
                }
                else
                System.out.println("Invalid Employee ID!");
            }

            else if(ch==5)
            break;
        }
    }
}

