import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int valorAlvo,qtdNumeros;
        int contAlvo = 0;
        int[] array;

        System.out.println("Qual o valor alvo?");
        valorAlvo = leia.nextInt();
        System.out.println("Quantos numeros inteiros deseja no vetor?");
        qtdNumeros = leia.nextInt();
        array = new int[qtdNumeros];

        for(int i = 0; i < array.length;i++){
            System.out.println(String.format("Número %d:",i+1));
            array[i] = leia.nextInt();
        }

        int aux = 0;
        while (aux<qtdNumeros){

            for (int l = 0; l < array.length;l++){
                if((array[aux]-array[l]) == valorAlvo){
                    contAlvo++;
                }
            }
            aux++;
        }

        System.out.println(String.format("Quantidade de pares: %d",contAlvo));
    }
}