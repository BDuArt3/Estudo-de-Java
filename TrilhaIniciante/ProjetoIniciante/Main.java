
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[2];
        int totalCadastros = 0;
        int opcao = 999;

        do { 
            System.out.println("Digite qual opcao voce quer:");
            System.out.println("1 - Cadastrar aluno.");
            System.out.println("2 - Calcular media de um aluno.");
            opcao = sc.nextInt();
            
            if (opcao == 1){
                totalCadastros = CadastrarAluno(alunos, totalCadastros, sc);
            } 
            if (opcao ==2 ){
                double media = CalcularMediaAluno(alunos, sc);    
                System.out.println(media);
            }
            
        } while (opcao != 0);

        



    }
    public static double CalcularMediaAluno(Aluno[] alunos, Scanner sc){
        int i = 0;
        System.out.println("Listando alunos cadastrados, selecione o numero respectivo ao aluno que a media deve ser calculada.");
        
        for (Aluno aluno : alunos){
            System.out.println(i + 1 + " - " + aluno.getNome());
            i += 1;
        }

        int alunoSelecionado = sc.nextInt();
        double media = alunos[alunoSelecionado - 1].calcularMedia();
        return media;
    }

    public static int CadastrarAluno(Aluno[] alunos, int totalCadastros, Scanner sc){
        if (totalCadastros >= alunos.length){
            System.out.println("Quantidade maxima de alunos atingida!");
            return totalCadastros;
        }

        System.out.println("Digite o nome do aluno");
        sc.nextLine();
        String nome = sc.nextLine();
        
        System.out.println("Digite a nota 1");
        double nota1 = sc.nextDouble();
        
        System.out.println("Digite a nota 2");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3");
        double nota3 = sc.nextDouble();


        alunos[totalCadastros] = new Aluno(nome, nota1, nota2, nota3);

        return totalCadastros + 1;
    }

}