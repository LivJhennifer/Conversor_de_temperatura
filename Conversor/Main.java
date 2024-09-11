import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escolha uma das opções:");
        System.out.println("Tipo 1: Celsius para Fahrenheit");
        System.out.println("Tipo 2: Fahrenheit para Celsius");
        System.out.println("Tipo 3: Celsius para Kelvin");
        System.out.println("Tipo 4: Kelvin para Celsius");
        System.out.println("Tipo 5: Kelvin para Fahrenheit");
        System.out.println("Tipo 6: Fahrenheit para Kelvin");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Digite a temperatura:");
        double temp = sc.nextDouble();
        Context context = new Context();
        switch (num) {
            case 1:
                CelsiusFahrenheit CF = new CelsiusFahrenheit();
                context.setConversor(CF);
                break;
            case 2:
                FahrenheitCelsius FC = new FahrenheitCelsius();
                context.setConversor(FC);
                break;
            case 3:
                CelsiusKelvin CK = new CelsiusKelvin();
                context.setConversor(CK);
                break;
            case 4:
                KelvinCelsius KC = new KelvinCelsius();
                context.setConversor(KC);
                break;
            case 5:
                KelvinFahrenheit KF = new KelvinFahrenheit();
                context.setConversor(KF);
                break;
            case 6:
                FahrenheitKelvin FK = new FahrenheitKelvin();
                context.setConversor(FK);
                break;
        
            default:
                break;

            }
        double resultado = context.calcularTemperatura(temp);
        String mensagem = String.format("O resultado é: %.1f", resultado);
        System.out.println(mensagem);
    }

}
