package expressivePuzzlers;

/**
 * Created by Stas on 18.03.2019.
 */
public class Oddity {
    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(7));
    }
}
