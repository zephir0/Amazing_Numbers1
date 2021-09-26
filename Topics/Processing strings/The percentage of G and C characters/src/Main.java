import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase(Locale.ROOT);
        String[] inputArray = input.split("");
        int counter = 0;
        int counter1 = 0;
        // HOW MANY 'C' is in STRING.
        for (int i = 0; i < inputArray.length; i++) {
            if (Objects.equals(inputArray[i], "c")) {
                counter++;
            }
            if (Objects.equals(inputArray[i], "g")) {
                counter1++;
            }
        }

        double gAndC = (double) counter + (double) counter1;
        double stringLength = (double)input.length();


        System.out.println((gAndC/stringLength) * 100);
    }
}