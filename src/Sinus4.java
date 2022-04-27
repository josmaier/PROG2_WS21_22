public class Sinus4 {
    public static void main(String[] args) {
    
        DoubleFunction f = (double x) -> {
            return Math.sin(x*x);
        };

        Wertetabelle.print(f);

        //Beste Lösung
        Wertetabelle.print(x -> Math.sin(x*x));
    }
}
