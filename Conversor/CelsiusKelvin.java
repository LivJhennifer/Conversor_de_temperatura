public class CelsiusKelvin implements ConversorStrategy {
    @Override
    public double calcularTemperatura(double temperatura) {
        return temperatura + 273.15;
    }
}
    