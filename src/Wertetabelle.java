public class Wertetabelle {
    public static void print(DoubleFunction f) {
        System.out.println("Wertetabelle " + f.toString());
        for (double x = 0.0; x <= 5.0; x += 1) {
            System.out.println(" " + x + "->" + f.berechne(x));
        }
    }
}