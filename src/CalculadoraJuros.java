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
                System.out.println("Você escolheu Juros Simples! (Lógica vem depois)");
                // Aqui no futuro pediremos o Capital, Taxa e Tempo
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