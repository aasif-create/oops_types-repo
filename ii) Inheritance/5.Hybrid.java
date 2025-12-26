interface OrderTracking
{
    void trackOrder();
}
interface OrderPayment
{
    void makePayment();
}
class OnlineOrder implements OrderTracking, OrderPayment
{
    @Override
    public void trackOrder(){
        System.out.println("Order is being tracked");
    }
    @Override
    public void makePayment() {
        System.out.println("Payment completed successfully");
    }}
class Amazon extends OnlineOrder
{
    void deliver() {
        System.out.println("Order delivered to customer");
        }}
@SuppressWarnings("unused")
class Hybrid
{
    public static void main(String[] args){
        Amazon obj = new Amazon();
        obj.trackOrder();
        obj.makePayment();
        obj.deliver();
    }}
/*1. OrderTracking and OrderPayment are interfaces .
2.OnlineOrder implements both interfaces,achieving multiple inheritance.
3.Amazon extends OnlineOrder, which is single-level inheritance.
4.Amazon inherits methods from both the parent class and interfaces.
5.The combination of two or more types inheritance is called
hybrid inheritance.*/


