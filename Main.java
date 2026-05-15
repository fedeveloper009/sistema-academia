import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Academia academia = new Academia("FitZone Academia");
        inicializarDadosExemplo(academia);

        int opcao = 0;
        do {
            System.out.println("\n===== SISTEMA DE GESTÃO DA ACADEMIA =====");
            System.out.println("1 - Contratar Funcionário");
            System.out.println("2 - Mostrar Tabela de Planos");
            System.out.println("3 - Ver Relatório de Gastos (Financeiro)");
            System.out.println("4 - Registrar Contratação de Plano");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        funcaoContratarFuncionario(sc, academia);
                        break;
                    case 2:
                        funcaoMostrarPlanos(academia);
                        break;
                    case 3:
                        funcaoMostrarGastos(academia);
                        break;
                    case 4:
                        funcaoRegistrarPlano(sc, academia);
                        break;
                    case 5:
                        System.out.println("Encerrando o sistema de gestão...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro na entrada de dados. Certifique-se de digitar um número válido.");
                sc.nextLine();
                opcao = 0;
            }
        } while (opcao != 5);

        sc.close();
    }

    private static void funcaoContratarFuncionario(Scanner sc, Academia academia) {
        System.out.println("\n--- Nova Contratação ---");
        Funcionario f = new Funcionario();

        System.out.print("Nome do Funcionário: ");
        f.setNome(sc.nextLine());

        System.out.print("Cargo: ");
        f.setCargo(sc.nextLine());

        System.out.print("Anos de Experiência: ");
        f.setAnosExperiencia(sc.nextInt());
        sc.nextLine();


        academia.contratarFuncionario(f);
        System.out.println("Funcionário contratado com sucesso!");
    }


    private static void funcaoMostrarPlanos(Academia academia) {
        System.out.println("\n===== TABELA DE PLANOS DISPONÍVEIS =====");
        academia.mostrarPlanos(1);
        academia.mostrarPlanos(2);
        academia.mostrarPlanos(3);

        System.out.println("----------------------------------------");

        System.out.println("Matrículas Ativas por Plano:");
        System.out.println("   Mais Barato : " + academia.getTotalPlanos());
        System.out.println("   Normal      : " + academia.getTotalPlanoNormal());
        System.out.println("   Plus Ultra  : " + academia.getTotalPlanoCaro());
    }


    private static void funcaoMostrarGastos(Academia academia) {
        System.out.println("\n===== RELATÓRIO FINANCEIRO DE GASTOS =====");

        System.out.printf("Gastos com Funcionários Gerais : R$ %.2f%n", academia.getGastosFuncionarios());
        System.out.printf("Gastos com Instrutores Técnicos: R$ %.2f%n", academia.getGastosInstrutores());

        double totalFolha = academia.getGastosFuncionarios() + academia.getGastosInstrutores();
        System.out.println("------------------------------------------");
        System.out.printf("TOTAL DA FOLHA DE PAGAMENTO    : R$ %.2f%n", totalFolha);
    }

    private static void funcaoRegistrarPlano(Scanner sc, Academia academia) {
        System.out.println("\n--- Registrar Venda de Plano ---");
        System.out.print("Digite o nome do plano (mais barato / normal / plus ultra): ");
        String plano = sc.nextLine();

        System.out.print("Quantidade de contratos desse tipo: ");
        int qtd = sc.nextInt();
        sc.nextLine();
        academia.setTotalPlanoContratados(plano, qtd);
        System.out.println("Plano registrado com sucesso!");
    }

    private static void inicializarDadosExemplo(Academia academia) {
        academia.setGastosFuncionarios(4500.00);
        academia.setGastosInstrutores(8200.00);
        academia.setTotalPlanoContratados("mais barato", 15);
        academia.setTotalPlanoContratados("normal", 22);
        academia.setTotalPlanoContratados("plus ultra", 8);
    }
}