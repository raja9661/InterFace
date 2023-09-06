interface Demo{
    int num=6;
    void show();
}
public class Test
{
    public static void main(String args[])
    {
        System.out.println(Demo.num +"  "+((Object)Demo.num).getClass().getSimpleName());
        //Demo d=new Demo(); cannot create object of interface
            }
}