import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int[] array = new int[inputNum];
        for (int i = 0; i < inputNum; i++) {
            array[i] = scanner.nextInt();
        }
        int A = 0, B = 0, C = 0, D = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                A++;
            } else if (array[i] == 4) {
                B++;
            } else if (array[i] == 3) {
                C++;
            } else if (array[i] == 2) {
                D++;
            }
        }
        System.out.println(D + " " + C + " " + B + " " + A);
    }
}