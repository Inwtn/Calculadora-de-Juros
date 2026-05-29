import java.util.Scanner;

public class CalculadoraJuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // O Array que guarda até 10 resultados
        double[] historico = new double[10];
        // O apontador que controla as gavetas
        int contadorSimulacoes = 0;
        int opcao = 0;
        // O laço mantém o programa vivo
        while (true) {
            System.out.println("================================");
            System.out.println("    SIMULADOR DE INVESTIMENTOS  ");
            System.out.println("================================");
            System.out.println("1 - Calcular Juros Simples");
            System.out.println("2 - Calcular Juros Compostos");
            System.out.println("3 - Ver Histórico"); // NOVA OPÇÃO
            System.out.println("4 - Sair do Sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("\n--- SIMULAÇÃO DE JUROS SIMPLES ---");

// 1. Capturando o Capital
                System.out.print("Digite o Capital inicial (R$): ");
                double capital = scanner.nextDouble();

// 2. Capturando a Taxa
                System.out.print("Digite a Taxa de Juros mensal (%): ");
                double taxa = scanner.nextDouble();

// 3. Capturando o Tempo
                System.out.print("Digite o Tempo da aplicação (em meses): ");
                int tempo = scanner.nextInt();

// 4. O Motor de Cálculo
                double juros = (capital * taxa * tempo) / 100;
                double montante = capital + juros;

// 5. Imprimindo o Extrato Formatado
                System.out.println("\n--- EXTRATO DA SIMULAÇÃO ---");
                System.out.printf("Valor Investido: R$ %.2f%n", capital);
                System.out.printf("Juros Gerados  : R$ %.2f%n", juros);
                System.out.printf("Valor Final    : R$ %.2f%n", montante);
                System.out.println("----------------------------\n");
                // Salvando no histórico (se ainda tiver espaço na array)
                if (contadorSimulacoes < historico.length) {
                    historico[contadorSimulacoes] = montante;
                    contadorSimulacoes++;
                } else {
                    System.out.println("* Aviso: Limite de histórico atingido. *");
                }
            } else if (opcao == 2) {
                System.out.println("\n--- SIMULAÇÃO DE JUROS COMPOSTOS ---");

// 1. Capturando o Capital
                System.out.print("Digite o Capital inicial (R$): ");
                double capital = scanner.nextDouble();

// 2. Capturando a Taxa
                System.out.print("Digite a Taxa de Juros mensal (%): ");
                double taxa = scanner.nextDouble();

// 3. Capturando o Tempo
                System.out.print("Digite o Tempo da aplicação (em meses): ");
                int tempo = scanner.nextInt();

// 4. O Motor de Cálculo (Juros Compostos)
                double taxaDecimal = taxa / 100;
                double montante = capital * Math.pow((1 + taxaDecimal), tempo);
                // Salvando no histórico (se ainda tiver espaço no gaveteiro)
                if (contadorSimulacoes < historico.length) {
                    historico[contadorSimulacoes] = montante;
                    contadorSimulacoes++;
                } else {
                    System.out.println("* Aviso: Limite de histórico atingido. *");
                }
                double juros = montante - capital;

// 5. Imprimindo o Extrato Formatado
                System.out.println("\n--- EXTRATO DA SIMULAÇÃO ---");
                System.out.printf("Valor Investido: R$ %.2f%n", capital);
                System.out.printf("Juros Gerados  : R$ %.2f%n", juros);
                System.out.printf("Valor Final    : R$ %.2f%n", montante);
                System.out.println("----------------------------\n");
            } else if (opcao == 3) {
                System.out.println("\n--- HISTÓRICO DE SIMULAÇÕES ---");

                if (contadorSimulacoes == 0) {
                    System.out.println("Nenhuma simulação realizada ainda.");
                } else {
                    // O laço percorre as gavetas que foram preenchidas
                    for (int i = 0; i < contadorSimulacoes; i++) {
                        System.out.printf("Simulação %d: R$ %.2f%n", (i + 1), historico[i]);
                    }
                }
                System.out.println("-------------------------------\n");
            } else if (opcao == 4) {
                System.out.println("Encerrando o sistema. Até logo!");
                break; // Isso quebra o loop infinito e encerra o programa
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } // <- Esta é a chave que fecha o while(true)


        scanner.close();
    }
}