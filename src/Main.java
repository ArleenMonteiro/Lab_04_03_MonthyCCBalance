public class Main {
    public static void main(String[] args)
    {
        int creditBalance=5000;
        double interestRate=0.17;
        double interest= creditBalance*interestRate;
        double interestTwo= creditBalance*interestRate*2;
        System.out.println("The credit card balance is: " + creditBalance);
        System.out.println("The interest due after one month is: " + interest);
        System.out.println("The interest due after two months is: " + interestTwo);

    }
}
