import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveCalcularSalarioAnalista() {
        Funcionario funcionario = new FuncionarioAnalista();
        funcionario.setSalarioBase(3000.0f);
        funcionario.setHorasExtras(5);
        // 3000 + (5 * 20) + 300
        assertEquals(3400.0f, funcionario.calcularSalarioFinal());
    }

    @Test
    void deveCalcularSalarioGerenteAbaixoDoLimiteDeHorasExtras() {
        Funcionario funcionario = new FuncionarioGerente();
        funcionario.setSalarioBase(5000.0f);
        funcionario.setHorasExtras(5);
        // 5000 + (5 * 20) + 1000
        assertEquals(6100.0f, funcionario.calcularSalarioFinal());
    }

    @Test
    void deveCalcularSalarioGerenteNoLimiteDeHorasExtras() {
        Funcionario funcionario = new FuncionarioGerente();
        funcionario.setSalarioBase(5000.0f);
        funcionario.setHorasExtras(10);
        // 5000 + (10 * 20) + 1000
        assertEquals(6200.0f, funcionario.calcularSalarioFinal());
    }

    @Test
    void deveCalcularSalarioGerenteAcimaDoLimiteDeHorasExtras() {
        Funcionario funcionario = new FuncionarioGerente();
        funcionario.setSalarioBase(5000.0f);
        funcionario.setHorasExtras(11);
        // 5000 + (11 * 20) + 1500
        assertEquals(6720.0f, funcionario.calcularSalarioFinal());
    }

    @Test
    void deveRetornarInfoAnalista() {
        Funcionario funcionario = new FuncionarioAnalista();
        funcionario.setMatricula(1);
        funcionario.setNome("Ana");
        funcionario.setSalarioBase(3000.0f);
        funcionario.setHorasExtras(5);
        assertEquals("Funcionario{matricula=1, nome='Ana', salarioFinal=3400.0}", funcionario.getInfo());
    }

    @Test
    void deveRetornarInfoGerente() {
        Funcionario funcionario = new FuncionarioGerente();
        funcionario.setMatricula(2);
        funcionario.setNome("Carlos");
        funcionario.setSalarioBase(5000.0f);
        funcionario.setHorasExtras(10);
        assertEquals("Gerente{matricula=2, nome='Carlos', salarioFinal=6200.0}", funcionario.getInfo());
    }
}