package comp1110.labtest2;

/**
 * Created by Pubudu Dissanayake on 8/28/15.
 * Project : comp1110-labtest2
 */
public class BMI {
    private String name;
    private double height;
    private double weight;

    public BMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getBMI() {
        return this.weight / (this.height * this.height);

    }

    @Override
    public String toString() {
        return name + " is " + height + "m tall and is " + weight + "kg and has a BMI of " + getBMI() + "kg/m^2";

    }

    public static void main(String[] args) {
        BMI bmi = new BMI("Pubudu", 1.65, 68);
        System.out.println(bmi.toString());
    }
}
