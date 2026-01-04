public class Arithmetic_Operators {
    public static void main (String args [])
    {
        int num1 = 7;
        int num2 = 5;
        int result = num1*num2;
        System.out.println(result);
        int r2 = num1/num2;
        System.out.println(r2);
        int r3 = num1%num2;
        System.out.println(r3);
        // num1=num1+2;
        // num1 *=2;
        // num1 ++;  post increment
        // ++num1;   pre increment
        System.out.println(num1);

        // int r4 = ++num1;
        int r4 = num1++;
        System.out.println(r4);
        
    }
}
