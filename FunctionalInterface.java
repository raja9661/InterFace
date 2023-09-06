interface Example2
{
    public void show();
}
class functionalIfs implements Example2
{
    public void show()
    {
        System.out.println("An Interface that contains exactly one abstract method is known as functional interface:");
    }
}
public class FunctionalInterface {
    public static void main(String args[])
    {
        Example2 ex=new functionalIfs();
        ex.show();
    }
    
}
