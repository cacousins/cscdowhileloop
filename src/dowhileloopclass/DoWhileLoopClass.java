package dowhileloopclass;

import java.util.Scanner;

public class DoWhileLoopClass {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0, sum = 0; //initialize and declare two values
        
        do {
            System.out.print("Enter an integer, 0 to end : ");
            score = input.nextInt();
            sum+=score;      //add the score to sum       
        } while (score!=0);
        System.out.println("The sum is : " + sum);
    }
    
}
