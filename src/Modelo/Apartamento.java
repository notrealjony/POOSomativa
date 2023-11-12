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
