class Instrutor extends Funcionario {
    private double salario;
    private String cpf;
    private String email;
    private String especialidade;

    public Instrutor() {
    }

    public double getSalario () {
        return this.salario;
    }
    public String getCpf () {
        return this.cpf;
    }
    public String getEmail () {
        return this.email;
    }
    public String getEspecialidade () {
        return this.especialidade;
    }
    public void setSalario (double salario) {
        if (salario != 0) {
            this.salario = salario;
        } else System.out.println("Erro, salário não pode estar vazio.");
    }

    public void setCpf(String cpf) {
        if (cpf.length() == 15){
            this.cpf = cpf;
        }else System.out.println("Erro, preencha com um cpf válido.");
    }

    public void setEmail(String email) {
        if (!email.isEmpty()) {
            this.email = email;
        }else System.out.println("Email incorreto.");

    }

    public void setEspecialidade(String especialidade) {
        if (!especialidade.isEmpty()) {
            this.especialidade = especialidade;
        }
        else System.out.println("Informe a especialidade do instrutor.");

    }
}