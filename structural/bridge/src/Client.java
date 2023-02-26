public class Client {
    public static void main(String[] args) {
       Bank ba = new BankA(new ConstantCustomer());
       Customer nc = ba.activateCustomer();
       nc.getInfo();

       Bank ba1 = new BankA(new NewCustomer());
       Customer cc = ba1.activateCustomer();
       cc.getInfo();

        Bank bb = new BankB(new NewCustomer());
        Customer cc1 = bb.activateCustomer();
        cc1.getInfo();

    }
}