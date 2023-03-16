import java.util.Scanner;
public class InterEx1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho do vetor? ");
        int qtd = sc.nextInt();

        int[] vetor = new int[qtd];

        System.out.println("Qual os valores do vetor? ");
        for (int i = 0; i < qtd; i++) {
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < qtd - 1; i++) {
            for (int j = i + 1; j < qtd; j++) {
                if (vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        System.out.println("Valores ordenados: ");
        for (int i = 0; i < qtd; i++){
            System.out.println(vetor[i] + " ");
            }

    }
}
