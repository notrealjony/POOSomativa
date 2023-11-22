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

    @Override public String toString() {
        return "\n Imóvel tipo Casa > Valor: " + getValorImovel() + " reais.  Taxa de Juros: " + getTaxaJurosAnual() +
                "% ao ano.  Prazo: " + getPrazoFinanciamento() + " meses,  Tamanho Construido: " + getTamanhoAreaConstruida() + "m²,  Tamanho Total: " + getTamanhoTerrenoCasa() + "m².";
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
    public double calcularTotalPagamento(double pagamentoMensal, int prazoFinanciamento){ // Método para calcular o total do pagamento
        totalPagamento = (pagamentoMensal * prazoFinanciamento);
        return totalPagamento;}

@Override
    public void imprimirFinanciamento(){
        double valorPag = getTotalPagamento();
        double valorImo = getValorImovel();
        valorPag = Math.round(valorPag);
        valorImo = Math.round(valorImo);
        System.out.printf("\n A casa possui um valor de R$:" + "%.2f" ,valorImo);
        System.out.printf("\n O valor do Financiamento é de R$:" + "%.2f, a Casa possui " + " %d m² construidos e " + " %d m² totais do imóvel. \n", valorPag, getTamanhoAreaConstruida(), getTamanhoTerrenoCasa());


    }




  public int getTamanhoTerrenoCasa(){
        return tamanhoTerrenoCasa;
  }
  public int getTamanhoAreaConstruida(){
        return tamanhoAreaConstruida;
  }


    }

