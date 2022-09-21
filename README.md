# mini_project
this is a problem in java and in this problem we need to find the correct number range between 0 to 100 if number find then ok otherwise do it untill the user itslef exit the code by inputing any neagtive value 








package java_file;
import java.util.Scanner;

public class miniproject {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int mynumber=(int)(Math.random()*100);
        System.out.println("Your task is to identify the number");
        Scanner var=new Scanner(System.in);
        int number;
        do{
            System.out.println("Now enter the number to identify your GUESS?");
            final int number=var.nextInt();

        }
        while(number>0);{
            if(mynumber==number){
                System.out.println("WOW WHAT A GUESS");
                System.out.println(mynumber);
            }
            else
            {
                System.out.println("Its a wrong answer\nLOL");
                System.out.println("If you wanna know right answer enter any neagtive value");
                if(number==-1) 
                {
                    System.out.println("The number is: %d"+ mynumber);
                }
                
            }
            
        }

    }
    }
    
