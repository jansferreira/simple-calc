import java.util.Scanner;

public class Program {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("[1] - Soma [2] - Subtração [3] - Divisão [4] - Multiplicação - [5] Sair");

        int opcao = sc.nextInt();

        Calc calc = new Calc();

        double n1, n2;

        while(opcao != 5){
            if(opcao == 1){

                System.out.println("Informe o primeiro Numero: ");
                n1 = sc.nextDouble();
                System.out.println("Informe o segundo Numero: ");
                n2 = sc.nextDouble();
                calc.setNumeros(n1, n2);
                System.out.println("Soma = "+calc.Soma());
            }
            if(opcao == 2){

                System.out.println("Informe o primeiro Numero: ");
                n1 = sc.nextDouble();
                System.out.println("Informe o segundo Numero: ");
                n2 = sc.nextDouble();
                calc.setNumeros(n1, n2);
                System.out.println("Subtração = "+calc.Subtracao());
            }
            if(opcao == 3){

                System.out.println("Informe o primeiro Numero: ");
                n1 = sc.nextDouble();
                System.out.println("Informe o segundo Numero: ");
                n2 = sc.nextDouble();
                calc.setNumeros(n1, n2);
                System.out.println("Divisão = "+calc.Divisao());
            }
            if(opcao == 4){

                System.out.println("Informe o primeiro Numero: ");
                n1 = sc.nextDouble();
                System.out.println("Informe o segundo Numero: ");
                n2 = sc.nextDouble();
                calc.setNumeros(n1, n2);
                System.out.println("Multiplicação = "+calc.Multiplicacao());
            }

            System.out.println("[1] - Soma [2] - Subtração [3] - Divisão [4] - Multiplicação - [5] Sair");

            opcao = sc.nextInt();
        }
        System.out.println("Fim");
    }
    
}
