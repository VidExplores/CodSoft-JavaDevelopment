import java.util.Scanner;
public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int option;
        do {
            System.out.println("Operations to perfom:\n\n1.Create Account\n2.Withraw\n3.Deposit\n4.Balance\n5.Transaction History\n6.Exit");
            option=sc.nextInt();
            switch (option) {
                case 1:
                    {
                        ATM atm=new ATM(null);
                    }
                    break;
            
                default:
                    break;
            }
        } while (option!=6);
    }
}
