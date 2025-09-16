import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço da viagem para a Alemanha: ");
        double precoAlemanha = sc.nextDouble();
        System.out.print("Quantidade de pessoas para Alemanha: ");
        int pessoasAlemanha = sc.nextInt();

        System.out.print("Digite o preço da viagem para Portugal: ");
        double precoPortugal = sc.nextDouble();
        System.out.print("Quantidade de pessoas para Portugal: ");
        int pessoasPortugal = sc.nextInt();

        System.out.print("Digite o preço da viagem para Itália: ");
        double precoItalia = sc.nextDouble();
        System.out.print("Quantidade de pessoas para Itália: ");
        int pessoasItalia = sc.nextInt();

        double total = (precoAlemanha * pessoasAlemanha) 
                     + (precoPortugal * pessoasPortugal) 
                     + (precoItalia * pessoasItalia);

        System.out.println("O valor total da viagem será: R$ " + total);
        sc.close();
    }
}
