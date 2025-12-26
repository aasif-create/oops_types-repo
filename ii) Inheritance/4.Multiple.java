interface ScanQr
{
    void scanQrCode();
}
interface BankTransfer
{
    void transferMoney();
}
class GPay implements ScanQr, BankTransfer
{
    @Override
    public void scanQrCode() {
        System.out.println("1.Scanning QR code for payment");
    }
    @Override
    public void transferMoney() {
        System.out.println("2.Transferring money through bank");
    }
}
@SuppressWarnings("unused")
class Multiple {
    public static void main(String[] args)
{
    GPay app = new GPay();
    System.out.println("GPAY CONSISTS OF BOTH FEATURES");
    app.scanQrCode();
    app.transferMoney();
    }
}
/*
1. ScanQr and BankTransfer are interfaces.
2. Each interface represents a different payment capability.
3. GPay implements both interfaces.
4. GPay gains multiple functionalities from multiple interfaces.
5. This is called multiple inheritance using interfaces.
*/
