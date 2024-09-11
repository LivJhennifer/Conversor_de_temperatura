public class Context {
    private ConversorStrategy conversor;

    public Context() {
    }

    public void setConversor(ConversorStrategy conversor) {
        this.conversor = conversor;
    }

    public double calcularTemperatura(double temperatura){
        return conversor.calcularTemperatura(temperatura);
    }
    
}