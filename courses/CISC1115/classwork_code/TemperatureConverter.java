public class TemperatureConverter {
    public static void main(String [] args) {
        double f = 255.5;

        // Convert Fahrenheit to Celsius
        double c = (f - 32) * 5 / 9;

        // Print temperature in Celsius 
        System.out.println(f + " degree(s) Fahrenheit is equal to " + c + " degree(s) Celsius.");
    }
}

