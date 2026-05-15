public class Planos {
    String tipoPlano;
    double valorPlanoBarato = 59.99;
    double valorPlanoMedio = 89.99;
    double valorPlanoPlus = 119.99;

    public String getTipoPlano() {
        return tipoPlano;
    }

    public double getValorPlanoBarato() {
        return valorPlanoBarato;
    }
    public double getValorPlanoMedio() {
        return valorPlanoMedio;
    }
    public double getValorPlanoPlus() {
        return valorPlanoPlus;
    }

    public void setTipoPlano(String tipoPlano) {
        switch (tipoPlano.toLowerCase()) {
            case "mais barato" -> {
                this.valorPlanoBarato = 59.99;
                this.tipoPlano = tipoPlano;
            }
            case "normal" -> {
                this.valorPlanoMedio = 89.99;
                this.tipoPlano = tipoPlano;
            }
            case "plus ultra" -> {
                this.valorPlanoPlus = 119.99;
                this.tipoPlano = tipoPlano;
            }
        }

    }
}