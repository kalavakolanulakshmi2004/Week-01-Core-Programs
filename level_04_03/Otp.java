package level3;
import java.util.*;
public class Otp {
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < 10; i++){
            otpArray[i] = generateOTP();
        }
        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));
        System.out.println("Are OTPs Unique? " + (areOTPsUnique(otpArray) ? "Yes" : "No"));
    }
}
