import java.util.*;
class NumberGame{
    public static void main(String[] args) {
        boolean attempt=true;
        int round=1,won=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n-----GUESS THE NUMBER GAME!!-----\n\nINSTRUCTIONS:\n------------\n1.Guess the number in the range of 1-100\n2.Yous have 5 attempts to guess the number\n3.If the number you have guessed is higher, then it will show too low or vice versa\n\n");
        while(attempt)
        {
            int rounds=game(round);
            if(rounds==1){
                won+=1;
            }
            System.out.println("Number of rounds | You won "+"\n        "+round+"        |    "+won);
            round++;
            System.out.println("\nDo you want to continue the game?(Y|N)");
            String ch=sc.nextLine();
            if(ch.equals("n") || ch.equals("no")|| ch.equals("N") || ch.equals("No"))
            attempt=false;
        }
    }
    public static int game(int n)
    {
        int rand=(int)(Math.random()*100);
        System.out.println("\nRound- "+n);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            System.out.println("Enter your guess:");
            int num=sc.nextInt();
            if(num>rand)
            {
                System.out.println("Your guess is Too high");
            }else if(num<rand)
            {
                System.out.println("Your guess is Too low");
            }
            else {
                System.out.println("Congratulations!! You won");
                return 1;
            }
        }System.out.println("Loose!!");
        return 0;
    }
}