import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String val = String.valueOf(number); // Get the string.
        StringBuilder sb = new StringBuilder(val);
        if (val.equals(sb.reverse().toString())) // if the reverse is the same...
        {
            System.out.println("1");
        } else {
            Random random = new Random();
            System.out.println(random.nextInt(999));
        }

    }
}