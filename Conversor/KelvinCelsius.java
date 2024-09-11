public class KelvinCelsius implements ConversorStrategy {
  
    @Override
    public double calcularTemperatura(double temperatura){
        return temperatura - 273.15;
    }
    
}

