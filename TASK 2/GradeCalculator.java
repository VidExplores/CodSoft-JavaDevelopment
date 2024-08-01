import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("-----Grade Calculator-----");
        System.out.println("\nEnter the number of subjects:");
        int n=sc.nextInt();
        int sum=0;
        String s="";
        for(int i=1;i<=n;i++)
        {
            System.out.println("\nEnter marks of subject "+i+" out of 100:");
            int score=sc.nextInt();
            String grade=grade(score);
            sum+=score;
            s+="\nSubject"+i+"   |   "+score+"   |  "+grade;
        }
        System.out.println("\nTotal mark         | "+sum+"\nFull mark  | "+n*100);
        DecimalFormat df=new DecimalFormat("0.00");
        float avg=(sum/n);
        System.out.println(s+" \n"+df.format(avg));
    }
    public static String grade(int marks)
    {
        if(marks>90)
        {
            return "A1";
        }else if(marks>80 && marks<91)
        {
            return "A2";
        }else if(marks>70 && marks<81)
        {
            return "B";
        }else if(marks>60 && marks<71)
        {
            return "C";
        }else if(marks>35 && marks<61)
        {
            return "D";
        }else
        return "FAIL";
    }
}
