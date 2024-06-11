import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 2, 8};
        int difference = findDifference(numbers);
        System.out.println("-------------------------------------------");
        System.out.println("Difference between largest and smallest: " + difference);
        System.out.println("-------------------------------------------");

        int[] smallestArray = {3,5,1,9,2};
        findSmallest(smallestArray);

        double xValue = 2.0;
        double yValue = 3.0;
        double finalResult = evaluateExpression(xValue, yValue);
        System.out.println("Result of the expression: " + finalResult);
        System.out.println("-------------------------------------------");
    }

    public static int findDifference(int[] numbers) {
        if (numbers.length < 1) {
            System.out.println("Array length must be at least 1");
//            OR, I know we didn't learn this, but I know this already. We would throw new exception
//            throw new IllegalArgumentException("Array length must be at least 1");
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max - min;
    }


    public static void findSmallest(int[] numbers) {
        if (numbers.length < 2) {
            System.out.println("Array must contain at least two elements");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }

        System.out.println("The smallest element is: " + smallest);
        System.out.println("The second smallest element is: " + secondSmallest);
        System.out.println("-------------------------------------------");
    }

    public static double evaluateExpression(double x, double y) {
        return Math.pow(x, 2) + Math.pow((4 * y / 5 - x), 2);
    }

}