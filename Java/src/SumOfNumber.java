import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to sum to: ");
        Scanner userIn = new Scanner(System.in);
        System.out.println("The sum is: " + ComputeSum(userIn.nextInt()));

    }

    public static int ComputeSum(int numbers) {
        int totalSum = 0;
        for (int counter = 0; counter <= numbers; counter++) {
            totalSum += counter;
        }
        return totalSum;
    }
}
