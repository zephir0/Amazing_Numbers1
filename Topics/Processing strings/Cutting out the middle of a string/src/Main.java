import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int middle = input.length() / 2;
        double middle1 = (double) input.length() / 2;
        Math.ceil(middle1);
        StringBuilder sb = new StringBuilder(input);
        if (input.length() % 2 == 0) {
            sb.deleteCharAt((int) middle1);
            sb.deleteCharAt(middle - 1);
            System.out.println(sb);
        } else {
            sb.deleteCharAt((int) middle1);
            System.out.println(sb);
        }
    }
}