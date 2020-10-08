package SS2;

public class VD14 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    public static void main(String[] args) {
        Customer objCutomer1 = new Customer();

        objCutomer1.customerID = 100;
        objCutomer1.customerName="John";
        objCutomer1.customerAddress="123Street";
        objCutomer1.customerAge=30;

        //Dislay
        System.out.println("Customer Identification Number:" +
                objCutomer1.customerID);
        System.out.println("Customer Name: "+objCutomer1.customerName);
        System.out.println("Customer Address: "+objCutomer1.customerAddress);
        System.out.println("Customer Age: "+objCutomer1.customerAge);
    }
}
