public class CelsiusFahrenheit implements ConversorStrategy {
    @Override
    public double calcularTemperatura(double temperatura){
        return (temperatura * 9/5) + 32;
    }
}
