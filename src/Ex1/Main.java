package Ex1;

import java.util.Scanner;

public class Main {
    public static void checkProductFruitOrVegetable(String product) {
        switch (product) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("Product is fruit.");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("Product is vegetable.");
                break;
            default:
                System.out.println("Product is unknown.");
                break;
        }
    }

    public static void calcSum(int n) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print( "enter a number: ");
            sum += scan.nextInt();
        }
        System.out.println("sum=" + sum);
    }


    public static String returnMinutesSeconds(int number1, int number2) {
        String minutesSeconds;
        int sum = number1 + number2;
        int minutes = 0, seconds = 0;
        if (sum % 60 != 0) {
            minutes = sum / 60;
            seconds = sum % 60;
        } else {
            minutes = sum / 60;
            seconds = 0;
        }
        minutesSeconds = minutes + ":" + seconds;
        return minutesSeconds;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = "banana";
        int num1 = 49, num2 = 100;
        System.out.println( "check product for fruit or vegetable");
        System.out.print( product+": ");
        checkProductFruitOrVegetable(product);
        System.out.println( );
        System.out.println( "return minutes:seconds");
        System.out.println( num1+" +" +num2+" in format minutes: seconds");
        System.out.println( returnMinutesSeconds(num1, num2));
        System.out.println( );
        System.out.print( "Calculate sum of n numbers. \n n=");
        int n = scan.nextInt();
        calcSum(n);



    }
}