/*
Simple program that multiplies user input by 10 and then reverses the output.
 */
package Reverse;

/**
 *
 * @author Sneako
 */
import java.util.Scanner;
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] numbers = readInputs(5);
        multiply(numbers, 10);
        printReversed(numbers);
        
    }
    
    public static double[] readInputs(int numberofInputs){
        System.out.println("Enter " + numberofInputs + " numbers: ");
        Scanner in = new Scanner(System.in);
        double[] inputs = new double[numberofInputs];
        for(int i=0; i<inputs.length; i++)
        {
            inputs[i] = in.nextDouble();
        }
        return inputs;
    }
    
    public static void multiply(double[] values, double factor){
        for (int i=0; i<values.length; i++)
        {
            values[i] = values[i] * factor;
        }
    }
    
    public static void printReversed(double[] values){
        for(int i=values.length-1; i>=0; i--)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}
