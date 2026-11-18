import java.util.Random;

public class DiceBias {
    public static void main(String[] args) {
        Random rand = new Random();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 =0;

        for (int i = 0; i < 1000; i++) {
            int dice = rand.nextInt(6) + 1;

            switch (dice) {
                case 1 :
                    count1++;
                    break;
                case 2 :
                    count2++;
                    break;
                case 3 :
                    count3++;
                    break;
                case 4 :
                    count4++;
                    break;
                case 5 :
                    count5++;
                    break;
                case 6 :
                    count6++;
                    break;
            }
        }
    System.out.println("1: "+ count1 + "times");
    System.out.println("2: "+ count2 + "times");
    System.out.println("3: "+ count3 + "times");
    System.out.println("4: "+ count4 + "times");
    System.out.println("5: "+ count5 + "times");
    System.out.println("6: "+ count6 + "times");
    }
}
