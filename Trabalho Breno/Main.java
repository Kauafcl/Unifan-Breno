
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Questao> questoes = new ArrayList<>();

        Cabecalho.exibir();

        questoes.add(new Questao(
                "1. Qual empresa desenvolve Counter-Strike 2?",
                new String[]{"Riot Games", "Ubisoft", "Valve", "Activision", "Epic Games"},
                3
        ));

        questoes.add(new Questao(
                "2. Quantos jogadores compoem uma equipe no competitivo ?",
                new String[]{"3", "4", "5", "6", "7"},
                3
        ));

        questoes.add(new Questao(
                "3. Qual o principal objetivo dos terroristas no modo de desarme?",
                new String[]{"Resgatar refens", "Plantar e garantir a explosao da C4",
                        "Eliminar apenas o melhor jogador", "Proteger os locais de bomba",
                        "Coletar armas"},
                2
        ));

        questoes.add(new Questao(
                "4. Qual arma e exclusiva dos terroristas?",
                new String[]{"M4A4", "FAMAS", "USP-S", "AK-47", "AUG"},
                4
        ));

        questoes.add(new Questao(
                "5. Qual mapa possui uma regiao chamada Banana?",
                new String[]{"Mirage", "Dust II", "Inferno", "Nuke", "Ancient"},
                3
        ));

        questoes.add(new Questao(
                "6. Qual equipamento permite desarmar a bomba mais rapidamente?",
                new String[]{"Colete", "Capacete", "Kit de desarme",
                        "Smoke", "Zeus x27"},
                3
        ));

        questoes.add(new Questao(
                "7. Quanto dinheiro cada jogador recebe no primeiro round competitivo?",
                new String[]{"$500", "$800", "$1000", "$1500", "$2000"},
                2
        ));

        questoes.add(new Questao(
                "8. Qual arma pode eliminar com um tiro na cabeca mesmo com capacete?",
                new String[]{"MP9", "Glock-18", "AK-47", "MAC-10", "P90"},
                3
        ));

        questoes.add(new Questao(
                "9. Qual mapa possui bombsites em andares diferentes?",
                new String[]{"Dust II", "Mirage", "Inferno", "Nuke", "Anubis"},
                4
        ));

        questoes.add(new Questao(
                "10. Qual a principal funcao da Smoke Grenade?",
                new String[]{"Causar dano", "Bloquear a visao", "Recuperar vida",
                        "Aumentar velocidade", "Desarmar a bomba"},
                2
        ));

        questoes.add(new Questao(
                "11. Qual motor grafico e utilizado no Counter-Strike 2?",
                new String[]{"Unreal Engine 5", "Unity", "Frostbite",
                        "Source 2", "CryEngine"},
                4
        ));

        questoes.add(new Questao(
                "12. Quanto tempo demora para desarmar a C4 sem kit?",
                new String[]{"3 segundos", "5 segundos", "7 segundos",
                        "10 segundos", "15 segundos"},
                4
        ));

        questoes.add(new Questao(
                "13. Quantos rounds regulamentares tem uma partida Premier?",
                new String[]{"20", "24", "26", "30", "36"},
                2
        ));

        questoes.add(new Questao(
                "14. Qual granada incendiaria e exclusiva dos contraterroristas?",
                new String[]{"Flashbang", "HE Grenade", "Molotov",
                        "Incendiary Grenade", "Decoy"},
                4
        ));

        questoes.add(new Questao(
                "15. Qual sistema de classificacao por pontos e usado no Premier?",
                new String[]{"ELO Global", "Premier Rank", "CS Rating",
                        "Valorant Rating", "Counter Points"},
                3
        ));

        int acertos = 0;

        System.out.println("Bem-vindo ao Quiz de Counter-Strike 2!");
        System.out.println("Responda as 15 perguntas escolhendo de 1 a 5.");
        System.out.println();

        for (int i = 0; i < questoes.size(); i++) {

            System.out.println("----------------------------------------");

            if (questoes.get(i).perguntar(scanner)) {
                acertos++;
            }

            System.out.println();
        }

        double porcentagem = (acertos * 100.0) / questoes.size();

        System.out.println("========================================");
        System.out.println("             RESULTADO FINAL");
        System.out.println("========================================");

        System.out.println("Total de questoes: " + questoes.size());
        System.out.println("Quantidade de acertos: " + acertos);
        System.out.println("Quantidade de erros: " + (questoes.size() - acertos));

        System.out.printf("Porcentagem de acertos: %.2f%%%n", porcentagem);

        System.out.println();
        System.out.println("Obrigado por participar do Quiz CS2!");
        System.out.println("========================================");

        scanner.close();
    }
}

