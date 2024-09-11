public class KelvinFahrenheit implements ConversorStrategy {
    @Override
    public double calcularTemperatura(double temperatura) {
        return (temperatura - 273.15) * 9/5 + 32;
    }

}
