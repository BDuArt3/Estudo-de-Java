import java.util.Scanner;
public class Entrada{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();   
            if (idade >= 18){
                System.out.println("Voce é de maior!");
            } else {
            
            System.out.println("Voce e de menor," + nome + "! \nPara que sua entrada seja permitida, sua idade deve ser impar!");

            int result = idade % 2;
            boolean result_par = false;
            System.out.println(result);
            if (result != 0) {
                System.out.println("Entrada permitida!");
            } else {
                result_par = true;
                System.out.println(result_par + "\nIdade par, entrada nao permitida!");
               
            }
            
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }

       
    }
}