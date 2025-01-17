import java.util.Scanner;

public class subtraction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 1st number ::");
        int num1 = sc.nextInt();

        System.out.println("Enter value of 2nd number ::");
        int num2 = sc.nextInt();

        System.out.println("Enter value of 3rd number ::");
        int num3 = sc.nextInt();

        System.out.println("difference of the given three numbers: "+(num1-num2-num3));
    }
}
