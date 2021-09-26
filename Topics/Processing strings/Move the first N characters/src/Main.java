import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();


        //replace left.

        if (n < s.length()) {
            String x = s.substring(0, n);
            String z = s.replace(x, "");

            System.out.println("" + z + x);
        } else {
            System.out.println(s);
        }

    }
}