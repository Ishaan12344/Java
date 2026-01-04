/* public class Methods {
    public static void main(String[] args) // here main is a method 
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(2);
        System.out.println(str);


    }
    
}

class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing");

    }

    public String getMeAPen(int cost)
    {
        if(cost>=10)
        {
            return "Pen";
        }
    
        return "Nothing";
        
    }
}
*/


public class Methods {
    public static void main(String[] args) // here main is a method 
    {
        Calculator obj = new Calculator();
        int r1=obj.add(12,13,2);
        System.out.println(r1);



    }
    
}

class Calculator
{
    public int add(int n1,int n2,int n3)
    {
        
        return n1+n2+n3;
    }
}