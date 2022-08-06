import java.util.Scanner;

interface Movable
{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable
{
    public int x, y, xSpeed, ySpeed;
    Scanner in = new Scanner(System.in);

    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public String toString()
    {
        return "("+x+", "+y+")";
    }

    public void moveUp()
    {
        System.out.println("Before Movement: "+toString());
        y+=ySpeed;
        System.out.println("After Movement : "+toString());
    }

    public void moveDown()
    {
        System.out.println("Before Movement: "+toString());
        y-=ySpeed;
        System.out.println("After Movement : "+toString());
    }

    public void moveLeft()
    {
        System.out.println("Before Movement: "+toString());
        x-=xSpeed;
        System.out.println("After Movement : "+toString());
    }
    public void moveRight()
    {
        System.out.println("Before Movement: "+toString());
        x+=xSpeed;
        System.out.println("After Movement : "+toString());
    }
    
}

class MovableCircle implements Movable
{
    public int x, y, xSpeed, ySpeed, radius;
    Scanner in = new Scanner(System.in);   
    
    MovableCircle()
    {
        x=0;
        y=0;
        xSpeed=0;
        ySpeed=0;
        radius=0;
    }

    Movable center =new MovablePoint(x,y,xSpeed,ySpeed);

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
        this.radius=radius;
    }

    public String toString()
    {
        return "("+x+", "+y+")";
    }

    public void moveUp()
    {
        System.out.println("Before Movement: "+toString());
        y+=ySpeed;
        System.out.println("After Movement : "+toString());
    }

    public void moveDown()
    {
        System.out.println("Before Movement: "+toString());
        y-=ySpeed;
        System.out.println("After Movement : "+toString());
    }

    public void moveLeft()
    {
        System.out.println("Before Movement: "+toString());
        x-=xSpeed;
        System.out.println("After Movement : "+toString());
    }
    public void moveRight()
    {
        System.out.println("Before Movement: "+toString());
        x+=xSpeed;
        System.out.println("After Movement : "+toString());
    }
}

public class q2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int ch;
        
        System.out.println("\nPoint\n");

        System.out.print("Enter x-coordinate:");
        int x=in.nextInt();
        System.out.print("Enter y-coordinate:");
        int y=in.nextInt();
        System.out.print("Enter x-Speed: ");
        int xSpeed=in.nextInt();
        System.out.print("Enter y-Speed: ");
        int ySpeed=in.nextInt();
        
        Movable m= new MovablePoint( x, y, xSpeed, ySpeed);
        while(true)
        {
            System.out.println("\n1. Move Up  2.Move Down  3.Move Left  4.Move Right  5.Exit");
            System.out.print("Enter your choice: ");
            ch=in.nextInt();
            if(ch==1)
            m.moveUp();
            else if(ch==2)
            m.moveDown();
            else if(ch==3)
            m.moveLeft();
            else if(ch==4)
            m.moveRight();
            else if(ch==5)
            break;
        }

        System.out.println("\n\nCircle Center\n");

        System.out.print("Enter x-coordinate:");
        x=in.nextInt();
        System.out.print("Enter y-coordinate:");
        y=in.nextInt();
        System.out.print("Enter x-Speed: ");
        xSpeed=in.nextInt();
        System.out.print("Enter y-Speed: ");
        ySpeed=in.nextInt();
        System.out.print("Enter radius: ");
        int radius=in.nextInt();
        Movable c= new MovableCircle(x, y, xSpeed, ySpeed, radius);
        while(true)
        {
            System.out.println("\n1. Move Up  2.Move Down  3.Move Left  4.Move Right  5.Exit");
            System.out.print("Enter your choice: ");
            ch=in.nextInt();
            if(ch==1)
            c.moveUp();
            else if(ch==2)
            c.moveDown();
            else if(ch==3)
            c.moveLeft();
            else if(ch==4)
            c.moveRight();
            else if(ch==5)
            break;
        }
    }
}