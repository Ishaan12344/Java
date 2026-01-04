class Casting
{
    public static void main (String args [])
    {
       byte b =127; 
       int a = 257;
       byte k = (byte)a;

       System.out.println(b);
       System.out.println(a);
       System.out.println(k);
       float f =  5.6f;
       int t = (int)f;
       System.out.println(t);

       // type Promotion
       byte y = 10;
       byte z = 30;
       int result = y*z;
       System.out.println(result);


    }
}

