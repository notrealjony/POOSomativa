package Main;
import Modelo.Casa;
import Modelo.Financiamento;
import Modelo.Terreno;
import Modelo.Apartamento;
import Util.InterfaceUsuario;
import java.util.Locale;
import java.util.ArrayList;
import java.math.RoundingMode;

public class Main {
    private double totalValor;

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR")); //Linguagem em PTBR para facilitar digitação nos inputs.
        ArrayList listaFinanciamento = new ArrayList();


        InterfaceUsuario usuario1 = new InterfaceUsuario(); // Criação de usuários
        Casa financiamento1 = new Casa(usuario1.getValorImovel(), usuario1.getPrazoFinanciamento(), usuario1.getTaxaJurosAnual(),usuario1.getTamanhoAreaConstruida(),usuario1.getTamanhoTerrenoCasa());
        double pagMensalFinanciamento1 = financiamento1.calcularPagamentoMensal(financiamento1.getValorImovel(), financiamento1.getPrazoFinanciamento(), financiamento1.getTaxaJurosAnual());
        double pagTotalFinanciamento1 = financiamento1.calcularTotalPagamento(pagMensalFinanciamento1, financiamento1.getPrazoFinanciamento());
        listaFinanciamento.add(financiamento1);


        Casa financiamento2 = new Casa(10,2,1,50,100);
        double pagMensalFinanciamento2 = financiamento2.calcularPagamentoMensal(financiamento2.getValorImovel(), financiamento2.getPrazoFinanciamento(), financiamento2.getTaxaJurosAnual());
        double pagTotalFinanciamento2 = financiamento2.calcularTotalPagamento(pagMensalFinanciamento2, financiamento2.getPrazoFinanciamento());
        listaFinanciamento.add(financiamento2);



       Apartamento financiamento3 = new Apartamento(15,3,1,2,6);
       double pagMensalFinanciamento3 = financiamento3.calcularPagamentoMensal(financiamento3.getValorImovel(), financiamento3.getPrazoFinanciamento(), financiamento3.getTaxaJurosAnual());
       double pagTotalFinanciamento3 = financiamento3.calcularTotalPagamento(pagMensalFinanciamento3, financiamento3.getPrazoFinanciamento());
       listaFinanciamento.add(financiamento3);


        Apartamento financiamento4 = new Apartamento(20,3,1,4,2);
        double pagMensalFinanciamento4 = financiamento4.calcularPagamentoMensal(financiamento4.getValorImovel(), financiamento4.getPrazoFinanciamento(), financiamento4.getTaxaJurosAnual());
        double pagTotalFinanciamento4 = financiamento4.calcularTotalPagamento(pagMensalFinanciamento4, financiamento4.getPrazoFinanciamento());
        listaFinanciamento.add(financiamento4);

        Terreno financiamento5 = new Terreno(50,5,1,"residencial");
        double pagMensalFinanciamento5 = financiamento5.calcularPagamentoMensal(financiamento5.getValorImovel(), financiamento5.getPrazoFinanciamento(), financiamento5.getTaxaJurosAnual());
        double pagTotalFinanciamento5 = financiamento5.calcularTotalPagamento(pagMensalFinanciamento5, financiamento5.getPrazoFinanciamento());
        listaFinanciamento.add(financiamento5);


        financiamento1.mostrarDadosFinanciamento(1);
        financiamento2.mostrarDadosFinanciamento(2);
        financiamento3.mostrarDadosFinanciamento(3);
        financiamento4.mostrarDadosFinanciamento(4);
        financiamento5.mostrarDadosFinanciamento(5);


        double totalValorImovel = (financiamento1.getValorImovel() + financiamento2.getValorImovel() + financiamento3.getValorImovel() + financiamento4.getValorImovel());
        totalValorImovel = Math.round(totalValorImovel);
        double somaFinanciamentos =  (pagTotalFinanciamento1 + pagTotalFinanciamento2 + pagTotalFinanciamento3 + pagTotalFinanciamento4);
        somaFinanciamentos = Math.round(somaFinanciamentos);
        System.out.printf("\n O total de todos os financiamentos é de : R$ " + "%.2f",somaFinanciamentos);
        System.out.printf("\n O valor da soma de todos os imóveis financiados é de : R$ " + "%.2f",totalValorImovel);
}}










    

