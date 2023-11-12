package Modelo;

import Util.InterfaceUsuario;

public abstract class Financiamento {
    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJurosAnual;
    protected double totalPagamento;

    public abstract double calcularPagamentoMensal(double valorImovel, int prazoFinanciamento,double taxaJurosAnual);


    public abstract double calcularTotalPagamento(double pagamentoMensal, int prazoFinanciamento); // Método para calcular o total do pagamento


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
    public void imprimirFinanciamento(){
        double valorPag = getTotalPagamento();
        double valorImo = getValorImovel();
        valorPag = Math.round(valorPag);
        valorImo = Math.round(valorImo);
        System.out.printf("\n O valor do Financiamento é de R$: " + "%.2f", valorPag);
        System.out.printf("\n O valor do imóvel do Financiamento é de R$: " + "%.2f" ,valorImo);}



}



