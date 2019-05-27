/*
Challenge
Have the function SimpleAdding(num) add up all the numbers from 1 to num.
For example: if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10.
For the test cases, the parameter num will be any number from 1 to 1000.

Sample Test Cases
Input:12

Output:78


Input:140

Output:9870


 */

import java.util.Scanner;

public class SimpleAdding {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("The output is: " + FindSimpleAdding(userIn.nextInt()));
    }

    //    This methods computes the Simple Addition of a given number
    public static int FindSimpleAdding(int num) {
        return (num == 0 ? 0 : num + FindSimpleAdding(num - 1));
    }
}
