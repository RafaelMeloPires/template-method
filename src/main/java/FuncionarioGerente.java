public class FuncionarioGerente extends Funcionario {

    public float calcularBonificacao() {
        if (this.getHorasExtras() > 10) {
            return this.getSalarioBase() * 0.30f;
        }
        else {
            return this.getSalarioBase() * 0.20f;
        }
    }

    @Override
    public String getTipo() {
        return "Gerente";
    }
}