
import java.util.Random;

public class App {

    public static void main(String[] args) {

        ListArrayOfInteger L1 = new ListArrayOfInteger();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            L1.add(r.nextInt(100));
        }

        int tam = 10;
        ListArrayOfInteger L2 = new ListArrayOfInteger();
        for (int i = 0; i < tam / 2; i++) {
            L2.add(i);
            L2.add(0, i);
        }
        System.out.println("L1: " + L1);
        System.out.println("L2: " + L2);

        L2.remove(0);
        L2.removeByIndex(0);
        System.out.println("L2 apos remocoes: " + L2);                
    }
}
