import java.util.Scanner;
class ATM {
    Scanner sc=new Scanner(System.in);
    private long accountNo;
    private String accountHolderName;
    private double balance;
    private int pin;
    
    public ATM(String name)
    {
        this.accountNo=(int)(Math.random()*Math.pow(10,11));
        this.accountHolderName=name;
        this.balance=0;
        createATM();
    }public long getAccountNo()
    {
        return this.accountNo;
    }
    public String name()
    {
        return this.accountHolderName;
    }
    public double getBalance()
    {
        return this.balance;
    }public ATM()
    {
        this.accountNo=(int)(Math.random()*Math.pow(10,11));
        this.accountHolderName="Vidisha Biswal";
        this.balance=0;
        this.pin=123456;
    }
    private void createATM()
    {
        System.out.println("Account has been created!!\n\nAccount Details:\nAccount Number: "+getAccountNo()+"\nAccount Holder Name: "+name()+"\nBakance: "+getBalance()+"\n");
        System.out.println("Generate pin:");
        this.pin=sc.nextInt();
    }
    public boolean checkPin(int pin)
    {
        if(this.pin==pin)
        return true;
        return false;
    }
    public void withdraw(double money)
    {
        if(this.balance<money)
        {
            System.out.println("Req money exceeded the total balance\nError!!\n");
        }else{
            this.balance-=money;
            System.out.println("Current Balance: "+getBalance());
        }
    }
    public void deposit(double money)
    {    
        this.balance+=money;
        System.out.println("Current Balance: "+getBalance());
    }
}