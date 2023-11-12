package Util;
import Modelo.Financiamento;
import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;


public class InterfaceUsuario {
   double valorImovel;
   int prazoFinanciamento;
   double taxaJurosAnual;
    int tamanhoAreaConstruida;
    int tamanhoTerrenoCasa;
    int vagasGaragem;
    int numeroAndar;
    String tipoZona;

    Scanner scanner = new Scanner(System.in);

    public InterfaceUsuario() {  //Interface para o Usuario digitar os dados.
        Locale.setDefault(new Locale("pt", "BR"));
            try{
                System.out.println("Digite 1 Para Criar um Financiamento para uma Casa.");
                System.out.println("Digite 2 Para Criar um Financiamento para um Apartamento.");
                System.out.println("Digite 3 Para Criar um Financiamento para um Terreno.");
                System.out.println("Digite 0 Para Sair.");
                int opcao = scanner.nextInt();


                if (opcao == 1) { // Tipo Casa
                        while (true) {
                            try {
                                System.out.println("Digite o valor da Casa: ");
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
                        while (true) {
                        try {
                            System.out.println("Digite o tamanho da área construída no imóvel em m²: ");
                            this.tamanhoAreaConstruida = scanner.nextInt();
                            if (tamanhoAreaConstruida <= 0) {
                                System.out.println("Por Favor digite um tamanho válido. ");
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Favor digitar um tamanho válido.");
                            scanner.nextInt(); // Limpa a entrada inválida do scanner
                        }
                        }
                            while (true) {
                                try {
                                    System.out.println("Digite o tamanho total do imóvel em m²: ");
                                    this.tamanhoTerrenoCasa = scanner.nextInt();
                                    if (tamanhoTerrenoCasa <= 0) {
                                        System.out.println("Por Favor digite um tamanho válido. ");
                                    } else {
                                        break;
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Favor digitar um tamanho válido.");
                                    scanner.nextInt(); // Limpa a entrada inválida do scanner
                                }

                            }}
            else if (opcao == 2){ // Tipo Apartamento
                    while (true) {
                        try {
                            System.out.println("Digite o valor do Apartamento: ");
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
                    while (true) {
                        try {
                            System.out.println("Digite o número de vagas no estacionamento: ");
                            this.vagasGaragem = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Favor digitar um tamanho válido.");
                            scanner.nextInt(); // Limpa a entrada inválida do scanner
                        }
                    }
                    while (true) {
                        try {
                            System.out.println("Digite o andar do imóvel: ");
                            this.numeroAndar = scanner.nextInt();
                            if (numeroAndar < 0) {
                                System.out.println("Por Favor digite um andar válido ou 0 para térreo.");
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Favor digitar um valor válido.");
                            scanner.nextInt(); // Limpa a entrada inválida do scanner
                        }

                    }}
            else if (opcao == 3){ // Tipo Terreno
                    while (true) {
                        try {
                            System.out.println("Digite o valor do Terreno: ");
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
                    while (true) {
                        try {
                            System.out.println("Informe o tipo de zona do imóvel: ");
                            this.tipoZona = scanner.next();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Favor digitar um tamanho válido.");
                            scanner.nextInt(); // Limpa a entrada inválida do scanner
                        }
                    }


                    }
            else if (opcao == 0){
                    System.out.println("Saindo...");
                }
            else{
                    System.out.println("Digite uma opção válida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Favor digitar um valor válido em reais.");
                scanner.next();}}

    public double getValorImovel() {
        return valorImovel;
    }
    public int getPrazoFinanciamento(){ // Metodo para conseguir o prazo do Financiamento
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual(){ // Metodo para conseguir a taxa de juros anual
        return taxaJurosAnual;
    }

    public int getTamanhoAreaConstruida() {
        return tamanhoAreaConstruida;
    }

    public int getTamanhoTerrenoCasa() {
        return tamanhoTerrenoCasa;
    }
}




