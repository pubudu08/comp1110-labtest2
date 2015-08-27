package comp1110.labtest2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/27/15.
 * Project : comp1110-labtest2
 */
public class Names {


    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String userInput = scanner.nextLine();
            stringArrayList.add(userInput);
        }
        for (int x = stringArrayList.size(); x > 0; x--) {
            System.out.println(stringArrayList.get(x - 1));
        }
    }
}
