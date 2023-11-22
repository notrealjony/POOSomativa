package Main;
import java.io.*;
import java.util.*;
import Modelo.Casa;
import Modelo.Financiamento;
import Modelo.Terreno;
import Modelo.Apartamento;
import java.util.Locale;
import java.util.ArrayList;
import Util.InterfaceUsuario;



public class Main implements Serializable {
    public static void mostrarFinanciamentos(List<Financiamento> listaFinanciamento){  //Imprimir no console os financiamentos
        for (Financiamento financiamento : listaFinanciamento){
           financiamento.imprimirFinanciamento();
        }
    }
    public static double calcularTotal(List<Financiamento> financiamentos) {  // Valor da soma dos imóveis
        double total = 0;
        for (Financiamento financiamento : financiamentos) {
            total += financiamento.getValorImovel();
        }
        return Math.round (total);
    }
    public static double calcularSomaPagamentos(List<Financiamento> financiamentos) { // Total da soma dos pagamentos
        double soma = 0;
         for (Financiamento financiamento : financiamentos) {
            soma += financiamento.getTotalPagamento();
        }
        return Math.round (soma);
    }


    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR")); //Linguagem em PTBR para facilitar digitação nos inputs.
        ArrayList listaFinanciamento = new ArrayList<>();

        InterfaceUsuario usuario1 = new InterfaceUsuario(); // Criação de usuários
        Casa financiamento1 = new Casa(usuario1.getValorImovel(), usuario1.getPrazoFinanciamento(), usuario1.getTaxaJurosAnual(),usuario1.getTamanhoAreaConstruida(),usuario1.getTamanhoTerrenoCasa());
        double pagMensalFinanciamento1 = financiamento1.calcularPagamentoMensal(financiamento1.getValorImovel(), financiamento1.getPrazoFinanciamento(), financiamento1.getTaxaJurosAnual());
        double pagTotalFinanciamento1 = financiamento1.calcularTotalPagamento(pagMensalFinanciamento1, financiamento1.getPrazoFinanciamento());
        listaFinanciamento.add(financiamento1);


      /*  Casa financiamento1 = new Casa(500000,120,10,50,100);  // Teste HARDCODE
        double pagMensalFinanciamento1 = financiamento1.calcularPagamentoMensal(financiamento1.getValorImovel(), financiamento1.getPrazoFinanciamento(), financiamento1.getTaxaJurosAnual());
        double pagTotalFinanciamento1 = financiamento1.calcularTotalPagamento(pagMensalFinanciamento1, financiamento1.getPrazoFinanciamento());
        listaFinanciamento.add(financiamento1); */



        Casa financiamento2 = new Casa(500000,75,5,75,150);
        double pagMensalFinanciamento2 = financiamento2.calcularPagamentoMensal(financiamento2.getValorImovel(), financiamento2.getPrazoFinanciamento(), financiamento2.getTaxaJurosAnual());
        double pagTotalFinanciamento2 = financiamento2.calcularTotalPagamento(pagMensalFinanciamento2, financiamento2.getPrazoFinanciamento());
        listaFinanciamento.add(financiamento2);


       Apartamento financiamento3 = new Apartamento(750000,100,3,2,7);
       double pagMensalFinanciamento3 = financiamento3.calcularPagamentoMensal(financiamento3.getValorImovel(), financiamento3.getPrazoFinanciamento(), financiamento3.getTaxaJurosAnual());
       double pagTotalFinanciamento3 = financiamento3.calcularTotalPagamento(pagMensalFinanciamento3, financiamento3.getPrazoFinanciamento());
       listaFinanciamento.add(financiamento3);


        Apartamento financiamento4 = new Apartamento(1000000,150,8,4,15);
        double pagMensalFinanciamento4 = financiamento4.calcularPagamentoMensal(financiamento4.getValorImovel(), financiamento4.getPrazoFinanciamento(), financiamento4.getTaxaJurosAnual());
        double pagTotalFinanciamento4 = financiamento4.calcularTotalPagamento(pagMensalFinanciamento4, financiamento4.getPrazoFinanciamento());
        listaFinanciamento.add(financiamento4);

        Terreno financiamento5 = new Terreno(1500000,180,5,"Residencial");
        double pagMensalFinanciamento5 = financiamento5.calcularPagamentoMensal(financiamento5.getValorImovel(), financiamento5.getPrazoFinanciamento(), financiamento5.getTaxaJurosAnual());
        double pagTotalFinanciamento5 = financiamento5.calcularTotalPagamento(pagMensalFinanciamento5, financiamento5.getPrazoFinanciamento());
        listaFinanciamento.add(financiamento5);


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Financiamentos.txt"));
            writer.write(financiamento1.toString());
            writer.write(financiamento2.toString());
            writer.write(financiamento3.toString());
            writer.write(financiamento4.toString());
            writer.write(financiamento5.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro na execução do Arquivo!");
            e.printStackTrace();
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Financiamentos.txt"));
            String line;
            while((line = reader.readLine()) !=null){
            System.out.println(line);}
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro, Arquivo não encontrado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erro na Leitura do Arquivo");
            e.printStackTrace();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("ListaFinanciamentos.txt"));
            writer.write(listaFinanciamento.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro na execução do Arquivo!");
            e.printStackTrace();
        }


        try {
            reader = new BufferedReader(new FileReader("ListaFinanciamentos.txt"));
            String line;
            while((line = reader.readLine()) !=null){
                System.out.println(line);}
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro, Arquivo não encontrado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erro na Leitura do Arquivo");
            e.printStackTrace();
        }

        mostrarFinanciamentos(listaFinanciamento);
        System.out.println("\n O valor da soma de todos os imóveis é de " + calcularTotal(listaFinanciamento));
        System.out.println(" O valor da soma de todos os financiamentos é de: " + calcularSomaPagamentos(listaFinanciamento));


        }

    }













    

