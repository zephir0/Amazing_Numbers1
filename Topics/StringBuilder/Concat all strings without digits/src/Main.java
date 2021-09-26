import java.util.Arrays;
import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        String x = Arrays.toString(strings);
        String s = x.replaceAll("\\d", "").replaceAll(" ", "").replaceAll(",", "").replaceAll("[\\[\\]\"]", "");;
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}