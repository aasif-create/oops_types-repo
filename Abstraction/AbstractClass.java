abstract class University
{
    abstract void publishResult();
    public void announce()
    {
        System.out.println("University announced result");
    }}
class College extends University {
    @Override
    public void publishResult()
    {
        System.out.println("Collecting marks from departments");
        System.out.println("Calculating grades");
        System.out.println("Publishing results to student portal");
    }}
public class AbstractClass {
    public static void main(String[] args) {
        University obj = new College();
        obj.announce();
        obj.publishResult();
    }}
/* 1.University is an abstract class that defines rules for
publishing results.
2.publishResult() is abstract, so it has no implementation details
3.announce() is a concrete method that provides common behavior.
4.College implements publishResult(), providing the actual logic.
5.Main class uses the abstract class reference, hiding the child
class implementation is called abstraction.
 */
