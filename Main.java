import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = n % 10 + n / 10 % 10 + n / 100 % 10;
        System.out.println(count);
    }
}
