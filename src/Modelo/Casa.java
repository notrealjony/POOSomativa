package Modelo;

public class Casa extends Financiamento {
    private int seguroObrigatorioCasa = 80;
    private int tamanhoAreaConstruida;
    private int tamanhoTerrenoCasa;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int tamanhoAreaConstruida, int tamanhoTerrenoCasa){ //Construtor
    this.valorImovel = valorImovel;
    this.prazoFinanciamento = prazoFinanciamento;
    this.taxaJurosAnual = taxaJurosAnual;
    this.tamanhoAreaConstruida = tamanhoAreaConstruida;
    this.tamanhoTerrenoCasa = tamanhoTerrenoCasa;
    }


public double calcularPagamentoMensal(double valorImovel, int prazoFinanciamento,double taxaJurosAnual){ //  Método para Cacular o valor do pagamento mensal
    this.valorImovel = valorImovel;
    this.prazoFinanciamento = prazoFinanciamento;
    this.taxaJurosAnual = taxaJurosAnual;
    double pagamentoMensal;
    double p = (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual / 12));
    pagamentoMensal = p + seguroObrigatorioCasa;                                                          // Juros Adicional
    return pagamentoMensal;
}


  public int getTamanhoTerrenoCasa(){
        return tamanhoTerrenoCasa;
  }
  public int getTamanhoAreaConstruida(){
        return tamanhoAreaConstruida;
  }


    }

