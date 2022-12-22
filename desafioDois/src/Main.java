import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int qntdNotas;
        float valor,resto,qtdMoedas;
        int[] notas = {100,50,20,10,5,2};
        double[] moedas = {1,0.50,0.25,0.10,0.05,0.01};

        System.out.println("Valor 1: ");
        valor = leia.nextFloat();
        resto = valor;

        System.out.println("NOTAS:");
        for(int i = 0; i < notas.length; i++){
            qntdNotas = (int)resto/notas[i];
            resto = resto%notas[i];
            System.out.println(String.format("%d " + "nota(s) de  R$ "+ notas[i], qntdNotas));
        }

        System.out.println("Moedas:");
        for(int j = 0; j < moedas.length; j++){
            qtdMoedas = (float) (resto/moedas[j]);
            resto = (float) (resto%moedas[j]);
            System.out.println(String.format("%d " + "moedas(s) de "+ moedas[j], (int)qtdMoedas).replace(",","."));
        }

    }
}