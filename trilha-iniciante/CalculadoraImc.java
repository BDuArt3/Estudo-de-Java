import java.util.Scanner;

public  class CalculadoraImc {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        String format_imc = String.format("%.2f", imc);

        System.out.println(format_imc);
    }

}