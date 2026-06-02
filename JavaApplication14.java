package javaapplication14;

public class JavaApplication14 {

    public static void main(String[] args) {

        int[] arr = {12, 23, 7, 15, 1};
        int key = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {

                System.out.println("Element found at index: " + i);
                break;
            }
        }
    }
}