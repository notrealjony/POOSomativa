package Modelo;

public class Terreno extends Financiamento {
    private String tipoZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual,String tipoZona){ //Construtor
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
        this.tipoZona = tipoZona;
    }

public double calcularPagamentoMensal(double valorImovel, int prazoFinanciamento,double taxaJurosAnual){ //  Método para Cacular o valor do pagamento mensal
    this.valorImovel = valorImovel;
    this.prazoFinanciamento = prazoFinanciamento;
    this.taxaJurosAnual = taxaJurosAnual;
    double pagamentoMensal;
    double p = (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual / 12));
    pagamentoMensal = p + (p * 0.02);
    return pagamentoMensal;}


}
