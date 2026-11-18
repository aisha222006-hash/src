import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();

        int dice = rand.nextInt(6) + 1;

        System.out.println("The dice value is: " + dice);
    }
}
