package utils;

public class ValidationUtils {

    // Validate level between 1 and 10
    public static boolean isValidLevel(int value) {
        return value >= 1 && value <= 10;
    }

    // Validate age
    public static boolean isValidAge(int age) {
        return age > 0 && age < 120;
    }
}