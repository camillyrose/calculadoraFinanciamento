package modelo;


public class Financiamento {

    //atributos
    private double valorImovel;
    private int prazoFinanciamentoAnos;
    private double taxaJurosAnual;

    //construtor
    public Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamentoAnos = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Getters
    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamentoAnos() {
        return prazoFinanciamentoAnos;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    //métodos
    public double calcularPagamentoMensal() {
        double taxaMensal = taxaJurosAnual / 12 / 100;
        int prazoFinanciamentoEmMeses = prazoFinanciamentoAnos * 12;
        return (valorImovel / (prazoFinanciamentoAnos * 12)) * (1 + (taxaJurosAnual / 12));
    }

    public double calcularTotalPagamento() {
        return this.calcularPagamentoMensal() * this.prazoFinanciamentoAnos * 12;
    }
}
