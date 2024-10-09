import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Informe um valor: ");
        int segundoNumero = sc.nextInt();

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;

        int somaViaFuncao = somarValores(primeiroNumero, segundoNumero);
        System.out.println(somaViaFuncao);

        System.out.println("Informe um valor: ");
        primeiroNumero = sc.nextInt();
        System.out.println("Informe um valor: ");
        segundoNumero = sc.nextInt();

        int subtrairViaFuncao = subtrairValores(primeiroNumero, segundoNumero);
        System.out.println(subtrairViaFuncao);

        System.out.println("Informe um valor: ");
        primeiroNumero = sc.nextInt();
        System.out.println("Informe um valor: ");
        segundoNumero = sc.nextInt();

        int multiplicarViaFuncao = multiplicarValores(primeiroNumero, segundoNumero);
        System.out.println(multiplicarViaFuncao);

        }

    public static int somarValores(int numA, int numB) {
        return numA + numB;
    }

    public static int subtrairValores(int numA, int numB) {

        if (numA < 0) {
            numA = numA * -1;
        }
        return numA - numB;
    }

    public static int multiplicarValores(int numA, int numB) {
        return numA * numB;
    }
    }