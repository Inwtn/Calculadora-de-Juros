import java.util.Scanner;

public class CalculadoraJuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        // O laço mantém o programa vivo
        while (true) {
            System.out.println("================================");
            System.out.println("    SIMULADOR DE INVESTIMENTOS  ");
            System.out.println("================================");
            System.out.println("1 - Calcular Juros Simples");
            System.out.println("2 - Calcular Juros Compostos");
            System.out.println("3 - Sair do Sistema");
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
            } else if (opcao == 2) {
                System.out.println("Você escolheu Juros Compostos! (Lógica vem depois)");
            } else if (opcao == 3) {
                System.out.println("Encerrando o sistema. Até logo!");
                break; // Essa é a palavra mágica que quebra o 'while(true)' e desliga o programa
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}