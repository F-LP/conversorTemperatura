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
        resultado = calsiusParaFahrenheit(temperatura);
        System.out.println("Resusltado: " + resultado + " Fahrenheit");
                
                break;

            case 2:
        
        
            default:
                break;
        }
















    }
}