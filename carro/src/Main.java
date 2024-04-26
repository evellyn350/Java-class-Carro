import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("escolha seu carro! ");
        Scanner scanner= new Scanner(System.in);
        System.out.println(" escolha a marca desejada:");
        String marca=  scanner.next();
        System.out.println(" Qual ano você deseja? ");
        int ano = scanner.nextInt();
        System.out.println(" cores disponiveis pela empresa com a marca: " + marca + "\n1 vermelho \n2 branco \n3 preto ");
        int cor = scanner.nextInt();
        System.out.println(" cor disponivel, deseja finalizar a venda?");
        scanner.next();
        System.out.println(" formas de pagamentos disponivel pela empresa? \n1 PIX \n2 cartão ");
        int pagamento =  scanner.nextInt();
        System.out.println(" transferência realizada com sucesso, obrigada! ");


    }

}