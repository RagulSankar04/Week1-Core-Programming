import java.util.Random;

public class OTPgenerator {
    public static int generateOTP() {
        Random rand = new Random();
        int OTP = rand.nextInt(900000) + 100000;
        return OTP;
        // return 100000 + (int) (Math.random() * 900000);
    }

    public static boolean areOTPsUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }
        System.out.println("The OTPs generated are: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(otpArray[i]);
        }
        if (areOTPsUnique(otpArray) == true) {
            System.out.println("All the OTPs genereated are Unique");
        } else {
            System.out.println("There are Duplicates");
        }
    }
}
