import java.util.*;
public class OTPGenerator {
    public static int generateOTP() {
        return (int) (100000 + Math.random() * 900000); // Range: 100000 - 999999
    }
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }
        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));
        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are repeated.");
        }
    }
}

