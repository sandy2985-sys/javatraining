package hellooo;
import java.util.*;


public class Hellooo {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Word:");
    String s1 = sc.next();
    String s2 = sc.next();
     char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
          Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}