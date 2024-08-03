public class ATM {

    private long accountNo;
    private String accountHolderName;
    private double balance;
    
    public ATM(String name)
    {
        this.accountNo=(int)(Math.random()*Math.pow(10,11));
        this.accountHolderName=name;
        this.balance=0;
        ATM();
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
    }
    private void ATM()
    {
        System.out.println("Account has been created!!\n\nAccount Details:\nAccount Number: "+getAccountNo()+"\nAccount Holder Name: "+name()+"\nBakance: "+getBalance()+"\n");
    }
}
