/**
 * Created by mac on 11/1/2016 AD.
 */
import java.util.Scanner;

public class SimpleStats
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter the amoung of number: "); // PROMPTS USER FOR # OF ITEMS
        double size = scan.nextDouble();

        double meanSum = 0;
        double deviationSum = 0;
        double array[] = new double [(int) size];


        System.out.println("Please enter all number: ");
        for (int i = 0; i < size; i++)
        {
            array[i]= scan.nextDouble();
        }


        for (int i = 0; i < size; i++)
        {
            meanSum += array[i];
        }

        double mean = ((meanSum / size));
        System.out.println("The mean is: " + mean);

        //STANDARD DEVIATION CALCULATION
        for (int i = 0; i < size; i++)
        {
            array[i] = (Math.pow((array[i] - mean), 2));
        }
        for (int i = 0; i < size; i++)
        {
            deviationSum += array[i];
        }

        double variance = ((deviationSum / size));

        double standardDeviation = Math.sqrt(variance);
        System.out.println("The standard deviation is: " + standardDeviation);

    }

}