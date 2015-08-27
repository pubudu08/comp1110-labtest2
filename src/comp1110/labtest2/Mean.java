package comp1110.labtest2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/27/15.
 * Project : comp1110-labtest2
 */
public class Mean {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            Double userInput = scanner.nextDouble();
            doubleArrayList.add(userInput);
        }
        double mean = 0;
        for (double d : doubleArrayList) {
            mean = mean+d;
        }
        System.out.println(mean/doubleArrayList.size());
    }
}
