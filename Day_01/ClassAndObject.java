class Calculator
{
    int a;
    public int add(int n1,int n2)
    {
        int r = n1+n2;
        return r;
    }
}



public class ClassAndObject {
    public static void main(String[] args) {
        int num1=5; // Primitive variable
        int num2=5;

        Calculator calc = new Calculator();  // Reference variable
        int result = calc.add(num1,num2);

        // int result = num1+num2;

        System.out.println(result);
    }
    
}
// Object Oriented Programming
// Object - Properties and Behaviours
// Anything to be done is should be done with an object
// Class act as a blueprint in java  

