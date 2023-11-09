package Modelo;

import Util.InterfaceUsuario;

public class Financiamento {
   protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJurosAnual;
    protected double totalPagamento;
    private InterfaceUsuario usuario;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){ // Construtor
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double calcularPagamentoMensal(double valorImovel, int prazoFinanciamento,double taxaJurosAnual){ //  Método para Cacular o valor do pagamento mensal
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
        double pagamentoMensal;
        double p = (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual / 12));
        pagamentoMensal = p;
        return pagamentoMensal;
    }

    public double calcularTotalPagamento(double pagamentoMensal, int prazoFinanciamento){ // Método para calcular o total do pagamento
        totalPagamento = (pagamentoMensal * prazoFinanciamento);
        return totalPagamento;

    }

    public double getValorImovel(){   // Metodo para conseguir o valor do Imovel
        return valorImovel;
    }
    public int getPrazoFinanciamento(){ // Metodo para conseguir o prazo do Financiamento
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual(){ // Metodo para conseguir a taxa de juros anual
        return taxaJurosAnual;
    }
    public double getTotalPagamento(){ // Metodo para conseguir a taxa de juros anual
        return totalPagamento;
    }

    public void mostrarDadosFinanciamento(int i){  // Metodo para mostrar os valores do financiamento e imóvel
        double valorPag = getTotalPagamento();
        double valorImo = getValorImovel();
        valorPag = Math.round(valorPag);
        valorImo = Math.round(valorImo);
        System.out.printf("\n O valor do Financiamento " + i + " é de R$: " + "%.2f", valorPag);
        System.out.printf("\n O valor do imóvel do Financiamento " + i +" é de R$: " + "%.2f" ,valorImo);

    }



}



