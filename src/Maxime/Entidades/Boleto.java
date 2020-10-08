package Maxime.Entidades;

import java.time.LocalDate;

public class Boleto {

    private String comprador;
    private double valor;
    private LocalDate vencimento;
    public double TAXA; // são criadas em letras maísculas variaveis que sao consideradas constates nao mudam de valor
    public int PRAZO;

    public Boleto(){
    }
    public Boleto(String comprador, double valor, LocalDate vencimento, double TAXA, int PRAZO){
     this.comprador = comprador;
     this.valor = valor;
     this.vencimento = vencimento;
     this.TAXA = TAXA;
     this.PRAZO = PRAZO;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }
}
