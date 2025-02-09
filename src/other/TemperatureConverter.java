package other;

public class TemperatureConverter {
    public static void main(String[] args) {

        double tempF = (25 * 9 / 5) + 32;
        double tempC = (77 - 32) * 5 / 9;

        System.out.println(25 + "C in Fahrenheit: " + tempF);
        System.out.println(77 + "F in Celsius: " + tempC);
    }
}
