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
public class ForLoop {

    public static void main(String[] args) {
        //initiation, condition, increment/decrement operator
        int evenNumber = 2;

        for (int counter = 1; counter <= 3; counter++) {
            System.out.println("Even Number >> " + evenNumber);
            evenNumber += 2;
        }
    }

}
