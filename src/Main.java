import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();

        long[][] dp = new long[2][a + 1];
        dp[0][0] = dp[1][0] = 1;

        for (int i = 1; i <= Math.max(a, b); i++) {
            dp[0][i] = dp[1][i - 1];
            dp[1][i] = dp[0][i - 1] + dp[1][i - 1];
        }

        long result = dp[0][a] + dp[1][a];
        System.out.println("Количество возможных последовательностей: " + result);
    }
}