import java.util.Scanner;

public class ContaLetraA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = entrada.nextLine();
        entrada.close();

        int quantidade = contarLetraA(texto);
        System.out.println("A letra 'a' (ou 'A') aparece " + quantidade + " vezes.");
    }

    public static int contarLetraA(String str) {
        int quantidade = 0;
        for (char caractere : str.toCharArray()) {
            if (caractere == 'a' || caractere == 'A') {
                quantidade++;
            }
        }
        return quantidade;
    }
}
