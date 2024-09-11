public class FahrenheitKelvin implements ConversorStrategy{
    @Override
    public double  calcularTemperatura(double temperatura){
        return (temperatura - 32) * 5/9 + 273.15;
    }

}
