public abstract class Funcionario {

    private int matricula;
    protected String nome;
    private float salarioBase;
    private int horasExtras;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }


    public float calcularValorHorasExtras() {
        return this.horasExtras * 20.0f;
    }

    public abstract float calcularBonificacao();


    public String getTipo() {
        return "Funcionario";
    }


    public float calcularSalarioFinal() {
        return this.salarioBase + this.calcularValorHorasExtras() + this.calcularBonificacao();
    }

    public String getInfo() {
        return getTipo() + "{" +
                "matricula=" + this.matricula +
                ", nome='" + this.nome + '\'' +
                ", salarioFinal=" + this.calcularSalarioFinal() +
                '}';
    }
}