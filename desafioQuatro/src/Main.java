import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int qtdFrases,centroEsquerda,fimCentro;
        String[] frases;

        System.out.println("Quantas frases deseja decifrar?");
        qtdFrases = Integer.parseInt(leia.nextLine());
        frases = new String[qtdFrases];

        System.out.println("Digite aqui a(s) frases que deseja decifrar:");
        for(int i = 0; i<frases.length;i++){
            String frase = leia.nextLine();
            frases[i] = frase;
        }

        int aux = 0;
        while (aux < frases.length){

            centroEsquerda = (frases[aux].length()-1)/2;
            fimCentro = frases[aux].length()-1;
            int aux2 = centroEsquerda;

            for(int j = centroEsquerda; j != -1; j--){
                char c = frases[aux].charAt(centroEsquerda);
                System.out.print(c);
                centroEsquerda--;
            }
            for(int k = fimCentro; k != aux2; k--){
                char c = frases[aux].charAt(fimCentro);
                System.out.print(c);
                fimCentro--;
            }
            aux++;
            System.out.println(" ");
        }

    }
}