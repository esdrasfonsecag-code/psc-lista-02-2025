import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = sc.nextDouble();
        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = sc.nextDouble();

        double total = precoLitro * litros;
        System.out.println("O cliente deverá pagar: R$ " + total);
        sc.close();
    }
}
