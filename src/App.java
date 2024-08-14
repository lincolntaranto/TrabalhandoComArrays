import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantas pessoas vão jogar?");
        int qtdJogadores = input.nextInt();
        input.nextLine();
        
        Pessoa[] jogadores = new Pessoa[qtdJogadores];


        for(int i = 0; i < jogadores.length; i++ ){

            Pessoa jogador = new Pessoa();
            System.out.println("Digite seu nome:");
            jogador.setNome(input.nextLine());
            System.out.println("Digite sua classe:");
            jogador.setClasse(input.nextLine());
            System.out.println("Digite sua idade:");
            jogador.setIdade(input.nextInt());
            input.nextLine();
            jogadores[i] = jogador;

        }

        for(int i = 0; i < jogadores.length; i++){
            System.out.println("Jogador[" + (i + 1) + "]");
            System.out.println("Nome: " + jogadores[i].getNome());
            System.out.println("Classe: " + jogadores[i].getClasse());
            System.out.println("Idade: " + jogadores[i].getIdade());
        }

        input.close();
    }
}
