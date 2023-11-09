package Modelo;

import Util.InterfaceUsuario;

public class Casa extends Financiamento {
    private int seguroObrigatorioCasa = 80;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){ //Construtor
    super(valorImovel, prazoFinanciamento, taxaJurosAnual);}


@Override
public double calcularPagamentoMensal(double valorImovel, int prazoFinanciamento,double taxaJurosAnual){ //  Método para Cacular o valor do pagamento mensal
    this.valorImovel = valorImovel;
    this.prazoFinanciamento = prazoFinanciamento;
    this.taxaJurosAnual = taxaJurosAnual;
    double pagamentoMensal;
    double p = (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual / 12));
    pagamentoMensal = p + seguroObrigatorioCasa;                                                          // Juros Adicional
    return pagamentoMensal;
}

    @Override
    public double calcularTotalPagamento(double pagamentoMensal, int prazoFinanciamento){ // Método para calcular o total do pagamento
        totalPagamento = (pagamentoMensal * prazoFinanciamento);
        return totalPagamento;
    }









}
