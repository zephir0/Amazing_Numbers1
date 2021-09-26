import java.util.Scanner;

class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            char[] inputArray = input.toCharArray();
            for(int i = 0; i < input.length(); i++){

                System.out.print("" + inputArray[i] + inputArray[i]);

            }
    }
}