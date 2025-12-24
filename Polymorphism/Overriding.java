class Calculator
{
    int add(int a, int b)
    {
        return a + b;
    }
}
class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        return a + b + 10;
    }
}
public class Overriding
{
    public static void main(String[] args) {
    Calculator calc = new AdvancedCalculator();
    System.out.println("OVERRIDDEN SUM VALUE :"+calc.add(10, 20));
    }
}
/*
1. Calculator class defines the add() method.
2. AdvancedCalculator overrides the add() method.
3. Method implementation is changed in the child class.
4. Method call is resolved at runtime.
5. This is called method overriding.
*/
