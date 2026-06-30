import java.util.*;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("0");
            return;
        }

        String binary = "";

        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }

        System.out.println(binary);
    }
}