package Util;

import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class InterfaceUsuario {
    double valorImovel;
    int prazoFinanciamento;
    double taxaJurosAnual;
    Scanner scanner = new Scanner(System.in);

    public InterfaceUsuario() {  //Interface para o Usuario digitar os dados.
        Locale.setDefault(new Locale("pt", "BR"));
        while (true) { //loops para erros.
            try {
                System.out.println("Digite o valor do imóvel:");
                this.valorImovel = scanner.nextDouble();
                if (valorImovel <= 0.0) {
                    System.out.println("Favor digitar um valor em reais válido.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Favor digitar um valor válido em reais.");
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.println("Digite em quantos meses deseja financiar: ");
                this.prazoFinanciamento = scanner.nextInt();
                if (prazoFinanciamento <= 1) {
                    System.out.println("Favor digitar um valor válido de prazo. (Digite o número de Meses)");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Favor digitar um valor válido de prazo. (Digite o número de Meses)");
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.println("Digite a taxa de juros anual: ");
                this.taxaJurosAnual = scanner.nextDouble();
                if (taxaJurosAnual >= 100) {
                    System.out.println("Por Favor digite uma taxa válida abaixo de 100. ");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Favor digitar uma taxa de juros válida.");
                System.out.println("Utilize apenas números e vírgula. ");
                scanner.next(); // Limpa a entrada inválida do scanner
            }
        }
    }

    

        //fórmulas para cálculos de financiamento
        public double getValorImovel () {   // Metodo para conseguir o valor do Imovel
            return valorImovel;
        }

        public int getPrazoFinanciamento () {
            return prazoFinanciamento;
        }

        public double getTaxaJurosAnual () {
            return taxaJurosAnual;
        }
    }




