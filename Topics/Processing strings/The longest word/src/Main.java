import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int sum = 0;
        int index = 0;


        for (int i = 0; i < inputArray.length; i++) {

            if (sum < inputArray[i].length()) {
                sum = inputArray[i].length();
            }
        }

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == sum) {
                index = i;
                break;
            }
        }



        if (sum == 1) {
            index = 0;
        }

        System.out.println(inputArray[index]);

    }
}