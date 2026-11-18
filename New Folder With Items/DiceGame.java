import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random rand = new Random();

        int user1 = rand.nextInt(6) + 1;
        int user2 = rand.nextInt(6) +1;
        int computer1 = rand.nextInt(6) + 1;
        int computer2 = rand.nextInt(6) +1;

        int userTotal = user1 + user2;
        int computerTotal = computer1 + computer2;

        System.out.println("User " + user1 + " and " + user2 + " , total:" + userTotal);
        System.out.println("Computer" + computer1 + " and" + computer2 + ", total" + computerTotal);

        if (userTotal > computerTotal) {
            System.out.println("User Wins");

        } else if (computerTotal > userTotal) {
            System.out.println("Computer Wins");
        } else {
            System.out.println("It is a Tie");
        }

    }
}
