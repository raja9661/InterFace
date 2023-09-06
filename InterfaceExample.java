interface Example
{
    void show(); //metod decleration without body
}
class Demo implements Example
{
   public void show()      // overriding void show method of interface class
    {
        System.out.println("This Demo class implement interface Example:");
    } 
}
public class InterfaceExample {
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.show();
    }
}
