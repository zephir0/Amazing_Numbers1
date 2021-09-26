import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase(Locale.ROOT);
        String[] inputArray = input.split("");
        int index = -2;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].contains("t") && inputArray[i + 1].contains("h") && inputArray[i + 2].contains("e")) {
                index = i;
                System.out.println(i);
                break;
            }
        }
        if (index == -2) {
            System.out.println(-1);

        }

        //System.out.println(Arrays.toString(inputArray));

    }
}