import java.util.Scanner;
public class palin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int rem = 0;
        while (a != 0) {
            int b = a % 10;
            rem = rem * 10 + b;
            a = a / 10;
        }
        if (temp == rem) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    sc.close();
}
}