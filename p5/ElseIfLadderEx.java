package p5;

import java.util.Scanner;

public class ElseIfLadderEx {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        while(true){
            System.out.print("Enter ticket price : ");
            int price = user.nextInt();

            if(price > 60 && price < 120){
                System.out.println("you can get seat from 1 to 30");
            } else if (price > 120 && price < 200){
                System.out.println("you can get seat from 31 to 60");
            } else if (price > 200 && price < 299){
                System.out.println("you an get seat from 61 to 100");
            } else if (price == 300){
                System.out.println("you can get special seat");
            } else {
                System.out.println("no tickets are available in this price");
            }

            if (price == 0){
                System.out.println(" \uD83D\uDD95\uD83D\uDD95\uD83D\uDD95\uD83D\uDD95");
                break;
            }
            System.out.println("Thank you❤💘💘💘💘💘💘💘");
        }
    }
}
