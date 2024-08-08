import java.util.Scanner;
public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ATM atm;
        System.out.print("Do you have an account?\n(Y/N)? ");
        String answer=sc.nextLine();
        if(answer.equals("Y") ||answer.equals("y"))
        {
            atm=new ATM();
        }else
        {
            System.out.print("Create Account:\n\nEnter name: ");
            String name=sc.nextLine();
            atm=new ATM(name);
        }
        int tryPass=0;
        while(true)
        {
            if(tryPass==3)
            {
                System.out.println("Error!! No more attempts...");
                break;
            }
            tryPass++;
            System.out.print("Enter pin: ");
            int pin=sc.nextInt();
            if(atm.checkPin(pin))
            break;
        }
        if(tryPass<3){
            int option;
        do {
            System.out.println("\nOperations to perfom:\n\n1.Withraw\n2.Deposit\n3.Balance\n4.Exit\n");
            option=sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                {
                    System.out.print("\nWithdrawal Amount: ");
                    double money=sc.nextInt();
                    atm.withdraw(money);
                }
                break;
                case 2:
                {
                    System.out.print("\nDeposited Amount: ");
                    double money=sc.nextInt();
                    atm.deposit(money);
                }
                break;
                case 3:
                {
                    System.out.print("\nCurrent Balance: "+atm.getBalance()+"\n");
                }
                break;
                default:
                break;
            }
        } while (option<4);
    }
    }
}
