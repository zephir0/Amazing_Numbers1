import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digits, sum = 0;
        while(number > 0){
            digits = number % 10;
            sum = sum + digits;
            number = number /10;
        }
        System.out.println(sum);


    }
}