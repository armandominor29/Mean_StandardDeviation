/**
 * Created by armandominor on 11/10/15.
 */
/**Program calculates Mean and Standard Deviation for a set of numbers in an array.**/
/**Calculation is done from the input given by hte user.**/

import java.util.*;

public class Mean_StandardDeviation
{
    public static void main(String[] args)
    {
        SetMethods array = new SetMethods(); //create array

        Scanner input=new Scanner(System.in); // Scanner class for user input

        System.out.println("How many numbers in your array?"); //ask user for array size

d

        System.out.println("\nMean: " + array.getMean()); // get mean from user input

        System.out.println("\nStandard Deviation: " + array.getStandardDeviation()); //get standard deviation from user input

    }
}