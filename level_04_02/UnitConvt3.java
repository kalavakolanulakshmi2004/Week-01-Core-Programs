package level2;
import java.util.*;
public class UnitConvt3 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fahrenheit to convert to Celsius: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println("Converted: " + convertFahrenheitToCelsius(fahrenheit) + " °C");
        System.out.print("Enter Celsius to convert to Fahrenheit: ");
        double celsius = scanner.nextDouble();
        System.out.println("Converted: " + convertCelsiusToFahrenheit(celsius) + " °F");
        System.out.print("Enter Pounds to convert to Kilograms: ");
        double pounds = scanner.nextDouble();
        System.out.println("Converted: " + convertPoundsToKilograms(pounds) + " kg");
        System.out.print("Enter Kilograms to convert to Pounds: ");
        double kilograms = scanner.nextDouble();
        System.out.println("Converted: " + convertKilogramsToPounds(kilograms) + " lbs");
        System.out.print("Enter Gallons to convert to Liters: ");
        double gallons = scanner.nextDouble();
        System.out.println("Converted: " + convertGallonsToLiters(gallons) + " liters");
        System.out.print("Enter Liters to convert to Gallons: ");
        double liters = scanner.nextDouble();
        System.out.println("Converted: " + convertLitersToGallons(liters) + " gallons");
    }
}