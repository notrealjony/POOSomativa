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
    double p = (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual / 12));
    double pagamentoMensal = p * 1.02;
    return pagamentoMensal;}

    public double calcularTotalPagamento(double pagamentoMensal, int prazoFinanciamento){ // Método para calcular o total do pagamento
        totalPagamento = (pagamentoMensal * ((double) prazoFinanciamento /12 ));
        return totalPagamento;}

    @Override
    public void imprimirFinanciamento(){
        double valorPag = getTotalPagamento();
        double valorImo = getValorImovel();
        valorPag = Math.round(valorPag);
        valorImo = Math.round(valorImo);
        System.out.printf("\n O Terreno possui um valor de R$:%.2f." ,valorImo);
        System.out.printf("\n O valor do Financiamento é de R$:" + "%.2f. O Terreno está localizado em uma zona %s. \n ", valorPag, getTipoZona());


    }

    public String getTipoZona(){
        return tipoZona;
    }


}
