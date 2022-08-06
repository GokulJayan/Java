import java.util.Scanner;

abstract class Animal
{
    protected int legs;

    protected Animal(int legs)
    {
        this.legs=legs;
    }

    void walk()
    {
        if(legs>0)
        System.out.println("Animal with "+legs+" legs is walking!");
        else
        System.out.println("Animal with "+legs+" legs can't walk!");
    }

    abstract void eat();
}

class Spider extends Animal
{
    Spider(int legs)
    {
        super(8);
    }

    public void eat() 
    {
        System.out.println("Spider is eating insects!");                
    }
}

interface Pet 
{
    String getName();
    void setName();
    void play();
}

class Cat extends Animal implements Pet
{
    String name;

    Cat(String name)
    {
        super(4);
        this.name=name;                
    }

    Cat()
    {
        this(" ");
    }    

    public String getName()
    {
        return name;
    }

    public void setName()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter name of cat: ");
        name= in.next();
    }

    public void play()
    {
        System.out.println("Cat is playing with ball!");
    }

    public void eat() 
    {
        System.out.println("Cat is eating fish!");                
    }
}

class Fish extends Animal
{
    String name;
    
    Fish()
    {
        super(0);
    }

    public String getName()
    {
        return name;
    }

    public void setName()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter name of fish: ");
        name= in.next();
    }

    public void eat()
    {
        System.out.println("Fish is eating something!");  
    }
}

public class TestAnimals
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Fish d = new Fish();
        Cat c = new Cat();
        Animal a = new Fish();
        Animal e = new Spider(8);
        Pet p = new Cat();

        //Fish
        d.setName();
        System.out.println("\nFish");
        System.out.println("Cat Name: "+d.getName());
        d.walk();
        d.eat();

        //Cat
        c.setName();
        System.out.println("\nCat:");
        System.out.println("No: of legs = "+c.legs);
        System.out.println("Cat Name: "+c.getName());
        c.walk();
        c.eat();
        c.play();

        //Animal Fish
        System.out.println("\nFish:");
        System.out.println("No: of legs = "+a.legs);
        a.walk();
        a.eat();

        //Animal Spider
        System.out.println("\nSpider:");
        System.out.println("No: of legs = "+e.legs);
        e.walk();
        e.eat();

        //Pet Cat
        p.setName();
        System.out.println("\nCat:");
        System.out.println("Cat Name: "+c.getName());
        p.play();
    }
}