import java.util.ArrayList;

public class Academia {
    private double gastosFuncionarios;
    private double gastosInstrutores;
    private int totalPlanobarato;
    private int totalPlanoNormal;
    private int totalPlanoCaro;
    private ArrayList <Instrutor> instrutor = new   ArrayList<>();
    private String nome;
    public Academia(String nome) {
        this.nome = nome;
    }
    public int getTotalPlanos() {
        return totalPlanobarato;
    }

    public int getTotalPlanoNormal() {
        return totalPlanoNormal;
    }

    public int getTotalPlanoCaro() {
        return totalPlanoCaro;
    }

    public void setTotalPlanoContratados(String plano, int planot) {
        switch (plano.toLowerCase()) {
            case "mais barato" -> this.totalPlanobarato = planot;
            case "normal" -> this.totalPlanoNormal = planot;
            case "plus ultra" -> this.totalPlanoCaro = planot;
            default -> System.out.println("Plano inválido.");
        }
    }
    public Planos mostrarPlanos(int plano) {
        Planos planos = new Planos();
        switch (plano) {
            case 1 -> {
                System.out.println("Plano mais barato");
                System.out.println("Preço: " + planos.getValorPlanoBarato());
            }
            case 2 -> {
                System.out.println("Plano normal");
                System.out.println("Preço: " + planos.getValorPlanoMedio());
            }
            case 3 -> {
                System.out.println("Plano plus ultra");
                System.out.println("Preço " + planos.getValorPlanoPlus());
            }
            default -> System.out.println("Plano invalido");
        }
        return planos;
    }
    public void setGastosFuncionarios(double gastosFuncionarios) {
        this.gastosFuncionarios = gastosFuncionarios;
    }
    public void setGastosInstrutores(double gastosInstrutores) {
        this.gastosInstrutores = gastosInstrutores;
    }

    public double getGastosFuncionarios() {
        return gastosFuncionarios;
    }
    public double getGastosInstrutores() {
        return gastosInstrutores;
    }

    public void contratarFuncionario(Funcionario f) {

    }
}