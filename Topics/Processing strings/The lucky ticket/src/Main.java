import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String ticketNumber = scanner.nextLine();

        char[] array = ticketNumber.toCharArray();

        for(int i = 0; i < array.length; i ++){
            array[i] = (char) Integer.parseInt(String.valueOf(array[i]));
        }
        if(array[0] + array[1] + array[2] == array[3] + array[4] + array[5] ){
            System.out.println("Lucky");
        } else
        {
            System.out.println("Regular");
        }

    }
}