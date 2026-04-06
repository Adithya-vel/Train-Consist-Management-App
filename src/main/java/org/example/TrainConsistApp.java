import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class TrainValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Train ID:");
        String trainId = sc.nextLine();

        System.out.println("Enter Cargo Code:");
        String cargoCode = sc.nextLine();

        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        if (trainMatcher.matches()) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }

        sc.close();
    }
}