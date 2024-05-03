import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner  = new
Scanner(System.in);

        System.out.println("Bem vindo ao conversor de temperatura!");
        System.out.println("Por favor , selecione a opção de entrada: ");
        System.out.println("1. Celsius para Fahrenheit ");
        System.out.println("2. Fahrenheit para Celsius ");
        System.out.println("3. Celsius para Kelvin ");
        System.out.println("4. Kelvin para Celsius ");
        System.out.println("5. Fahrenheit para Kelvin");
        System.out.println("6. Kelvin para Fahrenheit");

        int opcao = scanner.nextInt();

        double temperatura;
        double resultado;

        switch (opcao) {

            case 1:
        System.out.println("Digite a temperatura em Celsius: ");
            temperatura = scanner.nextDouble();
            resultado = celsiusParaFahrenheit(temperatura);
        System.out.println("Resultado: " + resultado + " Fahrenheit");
                
                break;

            case 2:
        System.out.println("Digite a temperatura em Fahrenheit: ");
            temperatura = scanner.nextDouble();
            resultado  = fahrenheitParaCelsius(temperatura);
        System.out.println("Resultado:" + resultado + "Celsius");
             
                break;

            case 3:
        System.out.println("Digite a temperatura em Celsius: ");
            temperatura = scanner.nextDouble();
            resultado = celsiusParaKelvin(temperatura);
        System.out.println("Resultado: " + resultado + "Kelvin");

                break;
            
            case 4:
        System.out.println("Digite a temperatura em Kelvin: ");
            temperatura = scanner.nextDouble();
            resultado = kelvinParaCelsius(temperatura);
        System.out.println("Resultado: " + resultado + "Celsius");

                break;

            case 5:
        System.out.println("Digite a temperatura em Fahrenheit: ");
            temperatura = scanner.nextDouble();
            resultado = fahrenheitParaKelvin(temperatura);
        System.out.println("Resultado: " + resultado + "Kelvin");
            
                break;

            case 6:
        System.out.println("Digite a temperatura em Kelvin: ");
            temperatura = scanner.nextDouble();
            resultado = kelvinParaFarenheit(temperatura);
        System.out.println("Resultado: " + resultado + "Fahrenheit");

                break;

            default:
        System.out.println("opção inválida.Por favor selecione uma opção válida");
        

        }

        scanner.close();

    }

    public static double celsiusParaFahrenheit (double Celsius)
    {

        return (celsius * 9 / 5) + 32;
    
    }

    public static double fahrenheitParaCelsius(double fahrenheit)
    {

        return (fahrenheit - 32) * 5/ 9;

    }

    public static double celsiusParaKelvin(double Celsius)
    {

        return Celsius + 273.15;

    }

    public static double kelvinParaCelsius(double Kelvin)
    {
        return 
    }








}