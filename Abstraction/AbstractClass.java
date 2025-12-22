abstract class University
{
    abstract void publishResult();
    void announce() {
        System.out.println("University has announced result publication");
    }
}
class College extends University {
    @Override
    void publishResult() {
        System.out.println("Collecting marks from departments");
        System.out.println("Calculating grades");
        System.out.println("Publishing results to student portal");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        University obj = new College();
        obj.announce();
        obj.publishResult();
    }
}
