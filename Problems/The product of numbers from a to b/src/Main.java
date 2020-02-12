import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        long product = 1;
        if (num1 < num2) {
            for (int i = num1; i < num2; i++) {
                product = product * i;

            }
            System.out.println(product);
        }
    }
}