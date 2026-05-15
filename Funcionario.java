public class Funcionario {
    private String cargo;
    protected String nome;
    protected int anosExperiencia;
    public Funcionario () {
    }

    public String getCargo() {
        return this.cargo;
    }
    public void setCargo (String cargo) {
        if (!cargo.isEmpty()) {
            this.cargo = cargo;
        }else System.out.println("Informe o cargo do funcionário.");
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome (String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }else System.out.println("Informe o nome do funcionário corretamente.");
    }public int getAnos() {
        return this.anosExperiencia;
    }
    public void setAnosExperiencia (int anosExperiencia) {
        if (anosExperiencia != -1) {
            this.anosExperiencia = anosExperiencia;
        }else System.out.println("Informe os anos de experiência do funcionário.");
    }
}
