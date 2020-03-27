/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhileloopclass;

/**
 *
 * @author cacousins
 */
public class DoWhileMenu {

    public static void main(String[] args) {
        //create a menu
        //with four possible options
        //if the user does not choose a correct option then the
        //the loop continues
        //sentinel value - 0
        //once a correct value is chosen, then it jumps to a switch
        java.util.Scanner input = new java.util.Scanner(System.in);
        int choice;

        do {
            //create the menu for the app
            System.out.println("");
            System.out.println("Calulator Program");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Division");
            System.out.println("4. Substraction");
            System.out.print("choose an opion, 0 to exit: ");
            choice = input.nextInt();

        } while (choice < 0 || choice > 4);

        /*
        based on the correct choice the use 
        would be directed to the switch
         if the user enters a 1. then the switch(1)
        would run the addition method
        */
        switch (choice) {
            case 1:
                System.out.println("Addition");
                break;
            case 2:
                System.out.println("Multi");
                break;
            case 3:
                System.out.println("Divi");
                break;
            case 4:
                System.out.println("Sub");
                break;
            case 0:
                System.out.println("Goodbye ...");
                break;

        }
    }

}
