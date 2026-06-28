import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total marks: ");
        int total = sc.nextInt();

        System.out.print("Enter obtained marks: ");
        int obtained = sc.nextInt();

        double percentage = (obtained * 100.0) / total;

        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}