package dowhileloopclass;

public class FlowChartToJavaCode {

    public static void main(String[] args) {
        int evenNumber, counter;
        evenNumber = 2;
        counter = 1;

        /*while (counter <= 3) {
        System.out.println("Result is: " + evenNumber );
        evenNumber+=2;
        counter+=1;
        }*/
        do {
            System.out.println("Result is: " + evenNumber);
            evenNumber += 2;
            counter += 1;
        } while (counter <= 3);

    }

}
