class Armstrong3Digit {
    public static void main(String[] args) {

        for (int num = 100; num <= 999; num++) {

            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;  // cube of digit
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}