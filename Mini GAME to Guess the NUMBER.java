package Pattern;
import java.util.Scanner;

public class mini {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int mynumber = (int) (Math.random() * 100);
        String s = "Your task is to identify the number";
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println("Numbers are from 1 to 100 ALL THE BEST!!!!");
        Scanner var = new Scanner(System.in);
        int n = 0, chances = 7;
        System.out.println("You have only 7 chances to guess the number");
        while (chances-- > 0) {
            System.out.println("Enter your number to find the right guess");
            n = var.nextInt();
            if (mynumber == n) {
                System.out.println("WOW WHAT A GUESS");
                break;
            }
            else if (n > mynumber) {
                System.out.println("Your number is too big");
                System.out.println("Remaining chances are " + chances);
            }
            else if (n < mynumber) {
                System.out.println("your number is too small");
                System.out.println("Remaining chances are " + chances);
            }
        }
        System.out.println("Your number is " + mynumber);
    }
}

