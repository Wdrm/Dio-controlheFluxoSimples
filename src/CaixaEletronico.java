import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 75.00;
        double valorSolicitado;
        System.out.println("Informe o Valor Que Deseja Sacar:\n");
        valorSolicitado = sc.nextDouble();
         if (valorSolicitado > saldo){
             System.out.println("Saldo Insuficiente!");
         }else{
          saldo = saldo - valorSolicitado;
             System.out.printf("Saldo Atualizado R$ "+saldo);
         }











    }
}