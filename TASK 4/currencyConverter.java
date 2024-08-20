import java.util.HashMap;
import java.util.Scanner;

class currencyConverter{
    public static void main(String[] args) {
        HashMap<Integer,String> currencyCode=new HashMap<>(); 
        currencyCode.put(1,"USD");
        currencyCode.put(2,"CAD");
        currencyCode.put(3,"EUR");
        currencyCode.put(4,"HKD");
        currencyCode.put(5,"INR");

        String fromCode,toCode;
        double amount;
        Scanner sc= new Scanner(System.in);

        System.out.println("Welcome to the currency converter:!");

        System.out.println("Currency converter from?");
        System.out.println("1.USD (US Dollar)\t2.CAD (Canadian Dollar)\t3.EUR (Europe)\t4.HKD (Hong Kong Dollar)\t5.INR (Indian Rupees)");
        fromCode=currencyCode.get(sc.nextInt());
    }
}
