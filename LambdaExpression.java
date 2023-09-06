interface car
{
    void drive();
}
public class LambdaExpression {
    public static void main(String args[])
    {
        car obj=()->{System.out.println("Driving");};
        obj.drive();
    }
    
}
