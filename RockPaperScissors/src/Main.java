import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        player player1 = new player();
        player player2 = new player();

        System.out.println("Rock, Paper, or Scissors?");
        player1.setAnswer(sc.nextLine());
        System.out.println("Rock, Paper, or Scissors?");
        player2.setAnswer(sc.nextLine());

        System.out.println(player1.compare(player2));

    }

}