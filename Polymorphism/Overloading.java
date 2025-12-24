class Calculator
{
    int add(int a, int b)
    {
        return a + b;
    }
}
class AdvancedCalculator extends Calculator {
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Overloading
{
public static void main(String[] args) {
AdvancedCalculator calc = new AdvancedCalculator();
System.out.println("SUM OF A AND B IS "+calc.add(10, 20));
System.out.println("SUM OF A,B AND C IS "+calc.add(10,20,30));
    }
}
/*
1. Calculator class contains multiple add() methods.
2. Methods have the same name but different parameters.
3. Method selection is decided at compile time.
4. Same method name performs different operations.
5. This is called method overloading.
*/
