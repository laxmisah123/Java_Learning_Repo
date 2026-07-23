import java.util.Scanner;
public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rem = 0;
        while (a != 0) {
            int b = a % 10;
            rem = rem * 10 + b;
            a = a / 10;
        }
        System.out.println("The reverse of a number:"+rem);
        sc.close();
    }
}
    
