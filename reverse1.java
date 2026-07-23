import java.util.Scanner;
public class reverse1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp=a;
        int rem = 0;
        while (a != 0) {
            int b = a % 10;
            rem =  rem+(b*b*b);
            a = a / 10;
        }
    if(temp==rem){
        System.out.println("The number is armstrong");
    }
    else{
         System.out.println("The number is not armstrong");
    }
        sc.close();
    }
}
    
