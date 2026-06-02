package example.program;
import java.util.Scanner;

public class ExampleProgram {

    public static int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Total Number:");
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;

        System.out.println("Enter The Numbers:");

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            int sum = digitSum(num);

            if (sum < min) {
                min = sum;
            }
        }

        System.out.println("Minimum Digit Sum = " + min);
    }
}