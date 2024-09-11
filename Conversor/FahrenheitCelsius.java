public class FahrenheitCelsius implements ConversorStrategy{
    @Override
    public double calcularTemperatura(double temperatura){
        return (temperatura - 32) * 5/9;
    }
}
