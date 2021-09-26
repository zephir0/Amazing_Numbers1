import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataInput = scanner.nextLine();
        String[] split = dataInput.split("-");
        System.out.print(split[1] + "/" + split[2] + "/" + split[0]);

    }
}