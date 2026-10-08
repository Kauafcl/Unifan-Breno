
import java.util.Scanner;

public class Questao {

    private String enunciado;
    private String[] alternativas;
    private int respostaCorreta;

    public Questao(String enunciado, String[] alternativas, int respostaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public boolean perguntar(Scanner scanner) {
        System.out.println(enunciado);

        for (int i = 0; i < alternativas.length; i++) {
            System.out.println((i + 1) + ") " + alternativas[i]);
        }

        int resposta = 0;

        while (resposta < 1 || resposta > 5) {
            System.out.print("Sua resposta (1-5): ");

            if (scanner.hasNextInt()) {
                resposta = scanner.nextInt();

                if (resposta < 1 || resposta > 5) {
                    System.out.println("Escolha uma opcao de 1 a 5.");
                }
            } else {
                System.out.println("Digite um numero valido.");
                scanner.next();
            }
        }

        if (resposta == respostaCorreta) {
            System.out.println("Resposta correta!");
            return true;
        } else {
            System.out.println("Resposta incorreta!");
            System.out.println("Resposta correta: " + respostaCorreta);
            return false;
        }
    }
}
