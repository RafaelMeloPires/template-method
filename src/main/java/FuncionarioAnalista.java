public class FuncionarioAnalista extends Funcionario {

    public float calcularBonificacao() {
        return this.getSalarioBase() * 0.10f;
    }
}