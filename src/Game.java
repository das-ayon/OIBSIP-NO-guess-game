import java.util.*;
public class Game {

    public static void NumberGame(int number){

        Scanner sc=new Scanner (System.in);
        int user_num;
        int n=5;
        System.out.println("Guess the number which is choosen in 5 given trials :");

        for (int i = 0; i < n; i++) {

            System.out.println("Guess the number:");
            user_num = sc.nextInt();

            if (number == user_num) {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("You Won!");
                break;
            }
            else if (number > user_num  ) {
                System.out.println("The number is greater than " + user_num);
            }
            else if (number < user_num ) {
                System.out.println("The number is less than " + user_num);
            }

            if (i == n-1) {
                System.out.println("You have exhausted 5 trials.");
                System.out.println("you Lose!");
                System.out.println("The number was " + number);
            }
        }

    }


    public static void main(String[] args) {

        int number =  (int)(Math.random()*100+1);
        NumberGame(number);

    }

}
