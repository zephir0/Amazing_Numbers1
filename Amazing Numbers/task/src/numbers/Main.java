package numbers;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    static String number;
    static long lastDigit;
    static String[] nNumber;
    static boolean exit = true;
    static String par1;
    static String par2;
    static String par3;
    static long numberInt;
    static String regex = "BUZZ|DUCK|PALINDROMIC|GAPFUL|SPY|EVEN|ODD|SUNNY|SQUARE|buzz|duck|palindromic|gapful|spy|even|odd|sunny|square";

    public static void main(String[] args) {
        start();

    }

    public static void start() {
        welcomeMessage();
        startProgram();

    }

    public static void startProgram() {

        while (exit) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a request:");
            number = scanner.next();
            nNumber = scanner.nextLine().split(" ");

            if (nNumber.length > 1) {
                int nInteger = Integer.parseInt(nNumber[1]);
                if (nInteger < 0) {
                    System.out.println("The second parameter should be a natural number.");
                    startProgram();
                }
            }
            exit();
        }

    }

    public static void isNumberNatural(long numberInt) {
        numberInt = Long.parseLong(number);
        String n = nNumber[1];
        par1 = nNumber[2];
        par2 = nNumber[3];
        par3 = nNumber[4];
        if (numberInt < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
        } else if (number.equals("0") || number.equals("zero")) {

        }
// FROM THE HIGHEST VALUE OF ENTER TO LOWEST.
        if (nNumber.length == 5) {
            threeProperties(par1, par2, par3, n);
        } else if (nNumber.length == 4) {
            twoProperties(par1, par2, n);
        } else if (nNumber.length == 3) {
            properties();
        } else if (nNumber.length > 1) {
            int nInteger = Integer.parseInt(nNumber[1]);
            for (int i = 0; i < nInteger; i++) {
                checkOthers();
                number = String.valueOf(Long.parseLong(number) + 1);
            }

            // If there is no nNumber
        } else {
            numberInt = Long.parseLong(number);
            if (numberInt < 0) {
                startProgram();
            } else {
                System.out.println("Properties of " + numberInt);
                System.out.println("buzz: " + isItABuzz(numberInt));
                System.out.println("duck: " + isDuck(number));
                System.out.println("palindromic: " + isPalindrome(number));
                System.out.println("gapful: " + isGapful(numberInt));
                System.out.println("even: " + isNumberEven(numberInt));
                System.out.println("odd: " + isNumberOdd(numberInt));
                System.out.println("spy: " + isSpy(number));
                System.out.println("square: " + isSquare(numberInt));
                System.out.println("sunny: " + isSunny(numberInt));


            }
        }
    }

    public static boolean isNumberOdd(long numberInt) {
        numberInt = Long.parseLong(number);
        return numberInt % 2 != 0;
    }

    public static boolean isNumberEven(long numberInt) {
        numberInt = Long.parseLong(number);

        return numberInt % 2 == 0;

    }

    public static boolean isItABuzz(long numberInt) {
        numberInt = Long.parseLong(number);
        lastDigit = (long) numberInt % 10;
        return numberInt % 7 == 0.0 || lastDigit == 7.0;
    }

    public static boolean isDuck(String number) {
        if (String.valueOf(number).startsWith("0")) {
            return false;
        } else
            return String.valueOf(number).contains("0");
    }

    public static boolean isPalindrome(String number) {
        String reverse = new StringBuilder(number).reverse().toString();
        return reverse.equals(number);
    }

    public static boolean isSpy(String number) {
        long longNumber = Long.parseLong(number);
        long multiplyLongNumber = Long.parseLong(number);
        long sum = 0;
        long multiply = 1;

        while (longNumber > 0) {
            long lastNumber = longNumber % 10;
            sum += lastNumber;
            longNumber /= 10;
        }

        while (multiplyLongNumber > 0) {
            long lastNumber = multiplyLongNumber % 10;
            multiply = lastNumber * multiply;
            multiplyLongNumber /= 10;
        }
        return multiply == sum;
    }

    public static boolean isSquare(long numberInt) {
        numberInt = Long.parseLong(number);
        return Math.sqrt((double) numberInt) % 1 == 0;
    }

    public static boolean isSunny(long numberInt) {
        numberInt = Long.parseLong(number);
        return Math.sqrt((double) numberInt + 1) % 1 == 0;
    }

    public static void exit() {
        long numberInt = Long.parseLong(number);

        if (!number.equals("0")) {
            isNumberNatural(numberInt);
        } else {
            System.out.println("Goodbye!");
            exit = false;
        }
    }

    public static boolean isGapful(long numberInt) {
        numberInt = Long.parseLong(number);

        char firstDigit = number.charAt(0);
        char lastDigit = number.charAt(number.length() - 1);
        String firstAndLast = firstDigit + "" + lastDigit;
        long intFirstandLast = Long.parseLong(firstAndLast);
        //Is the number more than 3 digits?
        return (number.length() >= 3 && numberInt % intFirstandLast == 0);

    }

    public static void welcomeMessage() {
        System.out.println("Welcome to Amazing Numbers!\n" +
                "\n" +
                "Supported requests:\n" +
                "- enter a natural number to know its properties; \n" +
                "- enter two natural numbers to obtain the properties of the list:\n" +
                "  * the first parameter represents a starting number;\n" +
                "  * the second parameter shows how many consecutive numbers are to be printed;\n" +
                "- two natural numbers and a property to search for;\n" +
                "- two natural numbers and two properties to search for;\n" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit.");
    }

    public static void properties() {
        String property = nNumber[2].toLowerCase(Locale.ROOT);


        switch (property) {
            case "spy":
                findSpy();
                break;
            case "sunny":
                findSunny();
                break;
            case "buzz":
                findBuzz();
                break;
            case "duck":
                findDuck();
                break;
            case "palindromic":
                findPalindromic();
                break;
            case "gapful":
                findGapful();
                break;
            case "even":
                findEven();
                break;
            case "odd":
                findOdd();
                break;
            case "square":
                findSquare();
                break;
            default:
                System.out.println("The property [" + property.toUpperCase(Locale.ROOT) + "] is wrong.");
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]");
        }
    }

    public static void checkOthers() {
        StringJoiner stringJoiner = new StringJoiner(", ");
        if (isItABuzz(numberInt)) {
            stringJoiner.add("buzz");
        }
        if (isSunny(numberInt)) {
            stringJoiner.add("sunny");
        }
        if (isSquare(numberInt)) {
            stringJoiner.add("square");
        }
        if (isDuck(number)) {
            stringJoiner.add("duck");
        }
        if (isPalindrome(number)) {
            stringJoiner.add("palindromic");
        }
        if (isGapful(numberInt)) {
            stringJoiner.add("gapful");
        }
        if (isNumberEven(numberInt)) {
            stringJoiner.add("even");

        }
        if (isNumberOdd(numberInt)) {
            stringJoiner.add("odd");
        }
        if (isSpy(number)) {
            stringJoiner.add("spy");
        }
        System.out.println(number + " is " + stringJoiner);
    }

    public static void findGapful() {
        int nInteger = Integer.parseInt(nNumber[1]);
        int counter = 0;
        for (int i = 0; i < 9999; i++) {
            if (!isGapful(numberInt)) {

            } else if (isGapful(numberInt)) {
                counter++;
                checkOthers();

                if (counter == nInteger) {
                    break;
                }
            }
            number = String.valueOf(Long.parseLong(number) + 1);

        }
    }

    public static void findBuzz() {
        int nInteger = Integer.parseInt(nNumber[1]);
        int counter = 0;
        for (int i = 0; i < 9999; i++) {
            if (!isItABuzz(numberInt)) {

            } else if (isItABuzz(numberInt)) {
                counter++;
                checkOthers();
                if (counter == nInteger) {
                    break;
                }
            }
            number = String.valueOf(Long.parseLong(number) + 1);

        }
    }

    public static void findEven() {
        int nInteger = Integer.parseInt(nNumber[1]);
        int counter = 0;
        for (int i = 0; i < 9999; i++) {
            if (!isNumberEven(numberInt)) {
// TEST I DZIAŁA - ZNAJDUJE EVEN I PALINDROME RAZEM / TERAZ TRZEBA TYLKO WYMYSLIC JAK TO ZAPISAC.
            } else if (isNumberEven(numberInt)) {
                counter++;
                checkOthers();

                if (counter == nInteger) {
                    break;
                }
            }
            number = String.valueOf(Long.parseLong(number) + 1);

        }
    }

    public static void findOdd() {
        int nInteger = Integer.parseInt(nNumber[1]);
        int counter = 0;
        for (int i = 0; i < 9999; i++) {
            if (!isNumberOdd(numberInt)) {

            } else if (isNumberOdd(numberInt)) {
                counter++;
                checkOthers();

                if (counter == nInteger) {
                    break;
                }
            }
            number = String.valueOf(Long.parseLong(number) + 1);
        }
    }

    public static void findPalindromic() {
        int nInteger = Integer.parseInt(nNumber[1]);
        int counter = 0;
        for (int i = 0; i < 999999; i++) {
            if (!isPalindrome(number)) {

            } else if (isPalindrome(number)) {
                counter++;
                checkOthers();

                if (counter == nInteger) {
                    break;
                }
            }
            number = String.valueOf(Long.parseLong(number) + 1);

        }
    }

    public static void findDuck() {
        int nInteger = Integer.parseInt(nNumber[1]);
        int counter = 0;
        for (int i = 0; i < 9999; i++) {
            if (!isDuck(number)) {

            } else if (isDuck(number)) {
                counter++;
                checkOthers();

                if (counter == nInteger) {
                    break;
                }
            }
            number = String.valueOf(Long.parseLong(number) + 1);

        }
    }

    public static void findSpy() {
        int nInteger = Integer.parseInt(nNumber[1]);
        int counter = 0;
        for (int i = 0; i < 99999999; i++) {
            if (!isSpy(number)) {

            } else if (isSpy(number)) {
                counter++;
                checkOthers();
                if (counter == nInteger) {
                    break;
                }
            }
            number = String.valueOf(Long.parseLong(number) + 1);
        }
    }

    public static void findSquare() {
        int nInteger = Integer.parseInt(nNumber[1]);
        int counter = 0;
        for (int i = 0; i < 9999; i++) {
            if (isSquare(numberInt)) {
                counter++;
                checkOthers();

                if (counter == nInteger) {
                    break;
                }
            }
            number = String.valueOf(Long.parseLong(number) + 1);
        }
    }

    public static void findSunny() {
        int nInteger = Integer.parseInt(nNumber[1]);
        int counter = 0;
        for (int i = 0; i < 9999; i++) {
            if (isSunny(numberInt)) {
                counter++;
                checkOthers();

                if (counter == nInteger) {
                    break;
                }
            }
            number = String.valueOf(Long.parseLong(number) + 1);
        }
    }

    public static void twoProperties(String par1, String par2, String n) {

        long nN = Long.parseLong(n);

        int counter = 0;
        wrongProperties2(par1, par2);
        for (int i = 0; i < 999999; i++) {
            if (getMethod(par1, numberInt) && getMethod(par2, numberInt)) {
                checkOthers();
                counter++;
            }
            if (counter == nN) {
                break;
            }
            number = String.valueOf(Long.parseLong(number) + 1);
        }

    }

    public static boolean getMethod(String string, long numberInt) {

        if (string.contains("buzz")) {
            return isItABuzz(numberInt);
        }
        if (string.contains("odd")) {
            return isNumberOdd(numberInt);
        }
        if (string.contains("spy")) {
            return isSpy(number);
        }
        if (string.contains("palindromic")) {
            return isPalindrome(number);
        }
        if (string.contains("sunny")) {
            return isSunny(numberInt);
        }
        if (string.contains("square")) {
            return isSquare(numberInt);
        }
        if (string.contains("duck")) {
            return isDuck(number);
        }
        if (string.contains("even")) {
            return isNumberEven(numberInt);
        }
        if (string.contains("gapful")) {
            return isGapful(numberInt);
        }
        return false;
    }

    //  PRZEROBIC BY SPRAWDZAC KAZDE JEDNO Z ARRAY.
    public static void wrongProperties2(String par1, String par2) {
        if (!par1.matches(regex) || !par2.matches(regex)) {
            if (!par1.matches(regex) && !par2.matches(regex)) {
                System.out.println("The properties [" + par1 + "," + par2 + "] are wrong.\r");
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]");

            } else if (!par1.matches(regex)) {
                System.out.println("The property [" + par1 + "] is wrong.\r");
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]");

            } else {
                System.out.println("The property [" + par2 + "] is wrong.\r");
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]");

            }
        } else {
            if ("even".matches(par1) && "odd".matches(par2) || ("odd".matches(par1) && "even".matches(par2))) {
                System.out.println("The request contains mutually exclusive properties: [" + par1 + "," + par2 + "]");
                System.out.println("There are no numbers with these properties.\n");
            } else if ("duck".matches(par1) && "spy".matches(par2) || ("spy".matches(par1) && "duck".matches(par2))) {
                System.out.println("The request contains mutually exclusive properties: [" + par1 + "," + par2 + "]");
                System.out.println("There are no numbers with these properties.\n");

            } else if ("sunny".matches(par1) && "square".matches(par2) || ("square".matches(par1) && "sunny".matches(par2))) {
                System.out.println("The request contains mutually exclusive properties: [" + par1 + "," + par2 + "]");
                System.out.println("There are no numbers with these properties.\n");
            }
        }
    }

    public static void threeProperties(String par1, String par2, String par3, String n) {

        long nN = Long.parseLong(n);

        int counter = 0;
        for (int i = 0; i < 999999; i++) {
            if (getMethod(par1, numberInt) && getMethod(par2, numberInt) && getMethod(par3, numberInt)) {
                checkOthers();
                counter++;
            }
            if (counter == nN) {
                break;
            }
            number = String.valueOf(Long.parseLong(number) + 1);
        }
    }

}

/// REMOVE LIMITATION = W METODZIE TWO PROPERTIES, PRZEROBIC NA METODE NOLIMITPROPERTIES
