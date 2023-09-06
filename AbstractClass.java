abstract class Example1
{
    abstract void display();
    void show()
    {
        System.out.println("I am in Abstract class:");
        System.out.println("***************************************");
    }
}
class Demo1 extends Example1
{
    void display()
    {
        System.out.println("implementation of abstract class in his child Demo class:");
    }
}
public class AbstractClass {
    public static void main(String args[])
    {
        Example1 ex=new Demo1();
        ex.display();
        ex.show();
    }
    
}
