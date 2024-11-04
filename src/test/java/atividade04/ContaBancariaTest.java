package java.atividade04;

import static org.junit.jupiter.api.Assertions.*;

import main.java.poo.atividade04.ContaBancaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaBancariaTest {
    private ContaBancaria conta;

    @BeforeEach
    public void setUp() {
        conta = new ContaBancaria(100.0);
    }

    @Test
    public void testDepositar() {
        conta.depositar(200.0);
        assertEquals(200.0, conta.getSaldo(), "O saldo após depósito de 200 deve ser 200.");
    }

    @Test
    public void testSacarDentroDoSaldo() {
        conta.depositar(150.0);
        conta.sacar(100.0);
        assertEquals(50.0, conta.getSaldo(), "O saldo após sacar 100 deve ser 50.");
    }

    @Test
    public void testSacarUsandoChequeEspecial() {
        conta.depositar(50.0);
        conta.sacar(100.0);
        assertEquals(0.0, conta.getSaldo(), "O saldo após o saque deve ser 0.");
        assertEquals(50.0, conta.getChequeEspecialDisponivel(), "Cheque especial disponível após o saque deve ser 50.");
    }

    @Test
    public void testSacarValorMaiorQueSaldoMaisChequeEspecial() {
        conta.depositar(50.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(200.0);
        });
        assertEquals("Saldo insuficiente, incluindo o cheque especial.", exception.getMessage());
    }

    @Test
    public void testDepositarValorNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            conta.depositar(-50.0);
        });
        assertEquals("Valor de depósito deve ser positivo.", exception.getMessage());
    }

    @Test
    public void testSacarValorNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(-10.0);
        });
        assertEquals("Valor de saque deve ser positivo.", exception.getMessage());
    }
}
