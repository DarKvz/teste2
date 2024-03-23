package application;

import entities.Pessoas;

import java.util.Scanner;

public class Programa_Miguelsouzadasilva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoas[] cadastros = new Pessoas[10];
        int totalCadastros = 0;

        while (true) {
            System.out.println("MENU");
            System.out.println("1  Cadastro Graduacao");
            System.out.println("2  Cadastro PosGraduacao");
            System.out.println("3  Sair");
            System.out.print("Escolha uma opcao: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); 
            if (escolha == 1) {
                if (totalCadastros < 10) {
                	Graduacao_Miguelsouzadasilva estudante = new Graduacao_Miguelsouzadasilva();
                    cadastrarEstudante(estudante, scanner);
                    cadastros[totalCadastros] = estudante;
                    totalCadastros++;
                    System.out.println("Cadastro de graduacao realizado com sucesso.");
                } else {
                    System.out.println("Limite de cadastros atingido (10).");
                }
            } else if (escolha == 2) {
                if (totalCadastros < 10) {
                	PosGraduacao_Miguelsouzadasilva estudante = new PosGraduacao_Miguelsouzadasilva();
                    cadastrarEstudante(estudante, scanner);
                    cadastros[totalCadastros] = estudante;
                    totalCadastros++;
                    System.out.println("Cadastro de pos-graduacao realizado com sucesso.");
                } else {
                    System.out.println("Limite de cadastros atingido (10).");
                }
            } else if (escolha == 3) {
                break; 
            } else {
                System.out.println("Opção invalida. Escolha novamente.");
            }
        }

        
        System.out.println("Todos os cadastros:");
        for (int i = 0; i < totalCadastros; i++) {
            System.out.println(cadastros[i].toString());
        }
    }

    private static void cadastrarEstudante(Pessoas estudante, Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        estudante.setNome(nome);

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        estudante.setCpf(cpf);

        System.out.print("Matricula: ");
        String matricula = scanner.nextLine();
        estudante.setMatricula(matricula);
    }
}