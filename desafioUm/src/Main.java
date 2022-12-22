import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] geral, pares,impares;
        int qtdNumeros,contPar,contImpar;
        contPar = 0;
        contImpar = 0;

        System.out.println("Quantos números inteiros e positivos deseja adicionar?");
        qtdNumeros = leia.nextInt();
        geral = new int[qtdNumeros];

        System.out.println("Digite os números: ");
        for(int i = 0; i < qtdNumeros; i++){
            geral[i] = leia.nextInt();
            if(geral[i]%2 == 0){
                contPar++;
            } else contImpar++;
        }

        pares = new int[contPar];
        impares = new int[contImpar];
        System.out.println("Preenchendo pares e impares...");
        int auxPar = 0;
        int auxImpar = 0;
        for (int j = 0; j < geral.length; j++) {
            if (geral[j]%2 == 0){
                pares[auxPar] = geral[j];
                auxPar++;
            } else {
                impares[auxImpar] = geral[j];
                auxImpar++;
            }
        }
        System.out.println("Ordenando Pares...");
        Arrays.sort(pares);
        System.out.println("Ordenando Impares...");
        for (int k = 1; k < impares.length; k++) {
            for (int l = 0; l < k; l++) {
                if (impares[k] > impares[l]) {
                    int aux = impares[k];
                    impares[k] = impares[l];
                    impares[l] = aux;
                }
            }
        }

        System.out.println("Ordenando valores...");
        int auxGeral = 0;
        for (int m = 0; m < pares.length; m++){
            geral[m] = pares[m];
            auxGeral++;
        }
        for (int n = 0; n < impares.length; n++){
            geral[auxGeral] = impares[n];
            auxGeral++;
        }

        System.out.println(" ");
        System.out.println("Valores ordenados:  ");
        for (int n : geral) {
            System.out.println(n);
        }

    }
}