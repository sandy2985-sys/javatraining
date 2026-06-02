package afternoon222;
import java.util.Scanner;


public class Afternoon222 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt()  ;
                    int target = sc.nextInt();
        int low = 0;
        int high = n - 1;
        int index = -1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == target) {
                index = mid;
                break;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if(index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }
        }
        
        
    }