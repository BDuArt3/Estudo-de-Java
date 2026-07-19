
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[2];
        int totalCadastros = 0;
        int opcao;

        do { 
            System.out.println("Digite a opcao:");
            System.out.println("1 - Cadastrar aluno.");
            System.out.println("2 - Calcular media de um aluno.");
            System.out.println("3 - Calcular media de todos os alunos.");
            System.out.println("4- Exibir aluno com maior media");
            System.out.println("5 - Listar alunos.");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 1){
                totalCadastros = CadastrarAluno(alunos, totalCadastros, sc);
            } 
            if (opcao ==2 ){
                double media = CalcularMediaAluno(alunos, sc);    
                if (!Double.isNaN(media)){
                    System.out.println("A media deste aluno e: " + media);
                    if (media >= 6.0){
                        System.out.println("O aluno foi aprovado.");
                    } else{
                        System.out.println("O aluno foi reprovado.");
                    }
                }
            }
            if (opcao == 3){
                CalcularMediaTodosAlunos(alunos);
            }
            if (opcao == 4){
                ExibirAlunoComMaiorMedia(alunos);
            }
            if (opcao == 5){
                ListarALunos(alunos);
            }
            
        } while (opcao != 0);

        return;

    }
    public static void ListarALunos(Aluno[] alunos) {
        System.out.println("Listando alunos:");
        for (Aluno aluno : alunos){
            if (aluno != null){
                System.out.println(aluno.getNome());
            }
        }
    }

    public static void ExibirAlunoComMaiorMedia(Aluno[] alunos) {
        int maiorAluno = 0;
        double maiorMedia = 0;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null){
                double media = alunos[i].calcularMedia();
                if (media > maiorMedia){
                    maiorMedia = media;
                    maiorAluno = i;
                }
            } 
        }

        System.out.println(alunos[maiorAluno].getNome() + ": " + maiorMedia);
    }

    public static void CalcularMediaTodosAlunos(Aluno[] alunos){
        for (Aluno aluno : alunos) {
            if (aluno != null){
                System.out.println("Aluno: " + aluno.getNome() + " | " + aluno.calcularMedia());
                System.out.println("----------"); 
            }    
        }
    }

    public static double CalcularMediaAluno(Aluno[] alunos, Scanner sc){
        
        System.out.println("Listando alunos cadastrados, selecione o numero respectivo ao aluno que a media deve ser calculada.");
        
        for (int i = 0; i < alunos.length; i++){
            if (alunos[i] != null){
                System.out.println(i + 1 + " - " + alunos[i].getNome());
            }
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