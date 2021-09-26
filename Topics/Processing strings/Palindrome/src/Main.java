import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reverse = new StringBuilder(input).reverse().toString();

        if(input.equals(reverse)){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }

    }
}