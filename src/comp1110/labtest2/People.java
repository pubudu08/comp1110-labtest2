package comp1110.labtest2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/27/15.
 * Project : comp1110-labtest2
 */
public class People {
    public static void main(String[] args) {
        HashMap<String, Integer> stringDoubleHashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String name = null;
        while (scanner.hasNext()) {
            String userInput = scanner.nextLine();
            String[] values = userInput.split(" ");
            name = values[0];
            if (values.length > 1) {
                int age = Integer.parseInt(values[1]);
                stringDoubleHashMap.put(name, age);
            }
        }
        if (stringDoubleHashMap.containsKey(name)) {
            System.out.println(stringDoubleHashMap.get(name));
        } else {
            System.out.println("unknown");
        }
    }
}
