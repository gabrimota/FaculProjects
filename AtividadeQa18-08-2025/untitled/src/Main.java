import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculoFrete freteService = new CalculoFrete();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o subtotal do pedido: ");
        double subtotal = scanner.nextDouble();

        System.out.print("Digite a distância em km: ");
        double distancia = scanner.nextDouble();

        double frete = freteService.calcularFrete(subtotal, distancia);

        System.out.println("O valor do frete é: R$ " + frete);
    }
}
