import java.util.Scanner;

public class Example3422 {
    public static void main(String[] argv) {
        double n, e, denom;
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        n = input.nextDouble();
        e = 1;
        denom = 1;
        for (int i = 1; i <= n; i++) {
            denom = denom * i;
            e = e + 1 / denom;
        }
        System.out.println("e = " + e);
    }
}
