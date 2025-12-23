interface University
{
    public void publishResult();
    default void announce()
    {
        System.out.println("University announced results");
    }}
class College implements University{
        @Override
        public void publishResult()
        {
        System.out.println("Collecting marks from departments");
        System.out.println("Calculating grades");
        System.out.println("Publishing results to student portal");
    }}
public class Interface {
        public static void main(String[] args) {
        University obj = new College();
        obj.announce();
        obj.publishResult();
    }}
/* 1. University is an interface that declares rules for
publishing results.
2. publishResult() is a method with no implementation details.
3. announce() is a default method that provides common behavior.
4. College implements publishResult(), providing the actual logic.
5. Main class uses the interface reference, hiding the
implementation details is called abstraction.
*/
