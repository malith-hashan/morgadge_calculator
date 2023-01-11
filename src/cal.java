import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class cal {
    public static void main(String[] args) {

        int capital=0;
        float air;//anual income rate
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to the morgade counter");


        while(true) {
            System.out.print("capital(1000<capital<1000000): ");//get capital
            capital = scan.nextInt();
            if(capital>1000 && capital<1_000_000)
                break;
            System.out.println("enter value between 1000 and 1000000");//error msg
        }
        while(true) {
            System.out.print("anual interest rate : ");//get anual interest rate
            air = scan.nextFloat();
            if(air>=0 && air<=30)
                break;
            System.out.println("anual interst rate not in 0 and 30");
        }

        System.out.print("period (years): ");//get period
        byte period = scan.nextByte();

        float mir = air/120; // get month interest rate
        double b = (double) Math.pow(1+mir ,period*12); //calculation part

        String morgage= NumberFormat.getCurrencyInstance().format((capital*mir*b)/(b-1));

        System.out.println("morgadge is :"+ morgage);

        }

    }

