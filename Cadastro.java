import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    // Lista que armazenará os funcionários
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE CADASTRO =====");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Listar funcionários");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:

                    Funcionario f = new Funcionario();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    f.setNome(nome);

                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    f.setCargo(cargo);

                    System.out.print("Anos de experiência: ");
                    int anos = sc.nextInt();
                    sc.nextLine();

                    f.setAnosExperiencia(anos);

                    // adiciona no ArrayList
                    funcionarios.add(f);

                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 2:

                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {

                        System.out.println("\n===== FUNCIONÁRIOS CADASTRADOS =====");

                        for (int i = 0; i < funcionarios.size(); i++) {

                            Funcionario func = funcionarios.get(i);

                            System.out.println("\nFuncionário " + (i + 1));
                            System.out.println("Nome: " + func.getNome());
                            System.out.println("Cargo: " + func.getCargo());
                            System.out.println("Experiência: " + func.getAnos() + " anos");
                        }
                    }

                    break;

                case 3:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

        sc.close();
    }
}