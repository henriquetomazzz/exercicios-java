package main.java.poo.atividade04;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;

    public ContaBancaria(double chequeEspecial){
        this.saldo = 0.0;
        this.chequeEspecial = chequeEspecial;
    }

    //depositar
    public void depositar(double valor){
        if (valor > 0){
            valor += saldo;
        }else{
            throw new IllegalArgumentException("Valor de saque deve ser positivo.");
        }
    }
    //sacar
    public void sacar(double valor){
        if (valor <= 0){
            throw new IllegalThreadStateException("Valor de saque deve ser positivo.");
        }
        if (valor <= saldo){
            saldo -= valor;
        }else if(valor <= saldo + chequeEspecial){
            double saldoResultante = valor - saldo;
            saldo = 0;
            chequeEspecial -= saldoResultante;
        }else{
            throw new IllegalThreadStateException("Saldo insuficiente, incluindo o cheque especial");
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public double getChequeEspecialDisponivel(){
        return chequeEspecial;
    }
}
