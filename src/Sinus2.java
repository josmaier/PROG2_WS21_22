public class Sinus2 {

    public static void main(String[] args) {
        class SinusFunction implements DoubleFunction{
            public double berechne(double x){
                return Math.sin(x*x);
            }
        }

        Wertetabelle.print(new SinusFunction());
    }


    
}
