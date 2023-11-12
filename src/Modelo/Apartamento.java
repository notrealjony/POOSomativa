package Modelo;


public class Apartamento extends Financiamento{
    private double taxaMensalAp;
    private double valorMeses;
    private int vagasGaragem;
    private int numeroAndar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int vagasGaragem, int numeroAndar){ //Construtor
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
        this.vagasGaragem = vagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    @Override
    public double calcularPagamentoMensal(double valorImovel, int prazoFinanciamento,double taxaJurosAnual){ //  Método para Cacular o valor do pagamento mensal
        double pagamentoMensal;
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
        taxaMensalAp = taxaJurosAnual / 12;
        valorMeses = ((prazoFinanciamento / 12) * 12);
        pagamentoMensal = valorImovel * (Math.pow((1 + taxaMensalAp), valorMeses))/ (Math.pow((1 +taxaMensalAp), (valorMeses - 1)));
        return pagamentoMensal;
    }

    public double calcularTotalPagamento(double pagamentoMensal, int prazoFinanciamento){ // Método para calcular o total do pagamento
        totalPagamento = (pagamentoMensal * prazoFinanciamento);
        return totalPagamento;}

    @Override
    public void imprimirFinanciamento(){
        double valorPag = getTotalPagamento();
        double valorImo = getValorImovel();
        valorPag = Math.round(valorPag);
        valorImo = Math.round(valorImo);
        System.out.printf("\n O Apartamento possui um valor de R$: %.2f."  ,valorImo);
        System.out.printf("\n O valor do Financiamento é de R$: " + "%.2f, o Apartamento possui %d vagas de estacionamento e está localizado no %d andar. \n", valorPag, getVagasGaragem(), getNumeroAndar());


    }


    public double getTaxaMensalApartamento(){
        taxaMensalAp = taxaJurosAnual / 12;
        return taxaMensalAp;
    }
    public int getVagasGaragem(){
        return vagasGaragem;
    }

    public int getNumeroAndar(){
        return numeroAndar;
    }





}
