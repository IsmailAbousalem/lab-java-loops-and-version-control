//package lab-java-loops-and-version-control;

public class Main {
    public static void main(String[] args) {
        // You can call the findDifference method here with an array of integers
        int[] myArray = {10, 5, 2, 8};
        int difference = findDifference(myArray);
        System.out.println("Difference between largest and smallest: " + difference);
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

}

//Task 1
//Write a Java method that returns the difference between the
//largest and smallest values in an array of integers. The length of the array must be at least 1.