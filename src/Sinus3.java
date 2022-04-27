public class Sinus3 {
    public static void main(String[] args) {
    
        DoubleFunction f = new DoubleFunction(){
            public double berechne(double x){
                return Math.sin(x*x);
            }
        };
        Wertetabelle.print(f);
    }
    
}
