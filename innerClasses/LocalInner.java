package innerClasses;

class Outer1
{
    int x=10;
    static int y=20;
    
    static class My
    {
        public void show()
        {
            System.out.println(y);
        }
    }
    
    
}

public class LocalInner 
{
    public static void main(String[] args) 
    {
        Outer1.My m=new Outer1.My();
        m.show();

    }
    
}
