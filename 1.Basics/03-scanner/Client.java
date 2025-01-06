import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert Client Name");
        String clientName = sc.nextLine(); // Read the insert on prompt

        System.out.println("Insert Client Age");
        int clientAge = sc.nextInt(); // Read the next int on prompt

        System.out.println("Insert Client Account Balance");
        double clientBalance = sc.nextDouble(); // Read the next double on prompt

    }
}
