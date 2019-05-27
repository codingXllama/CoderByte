/*
Challenge
Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it.
or example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
For the test cases, the range will be between 1 and 18 and the input will always be an integer.
Sample Test Cases
Input:4

Output:24


Input:8

Output:40320


 */


import java.util.Scanner;

public class FirstFactorial_Recursive {
    public static void main(String[] args) {
        System.out.println("Enter Number to compute it's factorial: ");
        Scanner userIn = new Scanner(System.in);
        System.out.println(FindFacotrial(userIn.nextInt()));

    }

    //This Method is responsible for computing the factorial of a given number
    public static int FindFacotrial(int num) {
        return (num <= 1 ? 1 : num * FindFacotrial(num - 1));
    }
}
