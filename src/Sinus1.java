public class Sinus1 {

    private static class SinusFunction implements DoubleFunction{
        public double berechne(double x){
            return Math.sin(x);
        }
    }

    public static void main(String[] args) {
        DoubleFunction f = new SinusFunction();
        Wertetabelle.print(f);
    }
    
}
