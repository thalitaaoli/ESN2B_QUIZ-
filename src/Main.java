import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- CABEÇALHO DO PROGRAMA ---
        System.out.println("==================================================");
        System.out.println("            SISTEMA DE QUIZ - ACADEMIA & NUTRIÇÃO ");
        System.out.println("==================================================");
        System.out.println(" Aluno: Estudante de Ciência da Computação        ");
        System.out.println(" Professor: Brenno Pimenta da Costa               ");
        System.out.println(" Tema: Musculação, Treino e Nutrição Esportiva    ");
        System.out.println("==================================================\n");

        // Criação do vetor de 15 questões
        Questao[] questoes = new Questao[15];

        // Questão 1
        questoes[0] = new Questao();
        questoes[0].pergunta = "Qual macronutriente é o principal responsável pela construção e recuperação da massa muscular?";
        questoes[0].opcaoA = "Carboidratos";
        questoes[0].opcaoB = "Proteínas";
        questoes[0].opcaoC = "Gorduras Boas";
        questoes[0].opcaoD = "Fibras";
        questoes[0].opcaoE = "Água";
        questoes[0].correta = "B";

        // Questão 2
        questoes[1] = new Questao();
        questoes[1].pergunta = "Qual é a principal função da Creatina no organismo de quem pratica musculação?";
        questoes[1].opcaoA = "Aumentar a queima direta de gordura abdominal";
        questoes[1].opcaoB = "Aumentar a produção de ATP, gerando mais força e explosão muscular";
        questoes[1].opcaoC = "Atuar como um estimulante do sistema nervoso central";
        questoes[1].opcaoD = "Substituir a necessidade de consumir água durante o treino";
        questoes[1].opcaoE = "Acelerar o crescimento do cabelo";
        questoes[1].correta = "B";

        // Questão 3
        questoes[2] = new Questao();
        questoes[2].pergunta = "Qual exercício composto é considerado o 'rei dos exercícios' para membros inferiores?";
        questoes[2].opcaoA = "Cadeira Extensora";
        questoes[2].opcaoB = "Agachamento Livre";
        questoes[2].opcaoC = "Leg Press 45º";
        questoes[2].opcaoD = "Flexora deitado";
        questoes[2].opcaoE = "Panturrilhas em pé";
        questoes[2].correta = "B";

        // Questão 4
        questoes[3] = new Questao();
        questoes[3].pergunta = "O que significa estar em 'Superávit Calórico' na nutrição esportiva?";
        questoes[3].opcaoA = "Consumir menos calorias do que o corpo gasta por dia";
        questoes[3].opcaoB = "Consumir exatamente a quantidade de calorias de manutenção";
        questoes[3].opcaoC = "Consumir mais calorias do que o corpo gasta, ideal para ganho de massa";
        questoes[3].opcaoD = "Cortar totalmente os carboidratos da dieta";
        questoes[3].opcaoE = "Fazer jejum intermitente por mais de 24 horas";
        questoes[3].correta = "C";

        // Questão 5
        questoes[4] = new Questao();
        questoes[4].pergunta = "Qual destes alimentos é uma excelente fonte de carboidrato de baixo índice glicêmico?";
        questoes[4].opcaoA = "Açúcar refinado";
        questoes[4].opcaoB = "Refrigerante comum";
        questoes[4].opcaoC = "Batata-doce";
        questoes[4].opcaoD = "Biscoito recheado";
        questoes[4].opcaoE = "Farinha de trigo branca";
        questoes[4].correta = "C";

        // Questão 6
        questoes[5] = new Questao();
        questoes[5].pergunta = "No treinamento de força, o que indica o termo 'Falha Muscular'?";
        questoes[5].opcaoA = "O momento em que o aluno desiste da série por tédio";
        questoes[5].opcaoB = "O ponto em que o músculo não consegue mais realizar nenhuma repetição com técnica correta";
        questoes[5].opcaoC = "Quando o equipamento da academia quebra";
        questoes[5].opcaoD = "O momento em que a frequência cardíaca zera";
        questoes[5].opcaoE = "A dor sentida no dia seguinte ao treino";
        questoes[5].correta = "B";

        // Questão 7
        questoes[6] = new Questao();
        questoes[6].pergunta = "Qual é a principal função do Whey Protein na suplementação?";
        questoes[6].opcaoA = "Fornecer proteína de alto valor biológico de forma prática";
        questoes[6].opcaoB = "Servir como pré-treino energético com estimulantes";
        questoes[6].opcaoC = "Impedir totalmente o acúmulo de gordura corporal";
        questoes[6].opcaoD = "Substituir todas as refeições sólidas do dia";
        questoes[6].opcaoE = "Garantir o relaxamento muscular noturno";
        questoes[6].correta = "A";

        // Questão 8
        questoes[7] = new Questao();
        questoes[7].pergunta = "Qual grupo muscular é primariamente trabalhado no exercício de Supino Reto?";
        questoes[7].opcaoA = "Quadríceps e Panturrilhas";
        questoes[7].opcaoB = "Costas e Bíceps";
        questoes[7].opcaoC = "Peitoral, Tríceps e Deltóide Anterior";
        questoes[7].opcaoD = "Abdômen e Lombar";
        questoes[7].opcaoE = "Posterior de coxa e glúteos";
        questoes[7].correta = "C";

        // Questão 9
        questoes[8] = new Questao();
        questoes[8].pergunta = "O que são Gorduras Boas (como as encontradas no abacate e azeite)?";
        questoes[8].opcaoA = "Gorduras saturadas e trans que entopem as artérias";
        questoes[8].opcaoB = "Ácidos graxos essenciais para a saúde hormonal";
        questoes[8].opcaoC = "Substâncias tóxicas que devem ser eliminadas da dieta";
        questoes[8].opcaoD = "Nutrientes que impedem a absorção de vitaminas";
        questoes[8].opcaoE = "Alimentos proibidos para quem treina pesado";
        questoes[8].correta = "B";

        // Questão 10
        questoes[9] = new Questao();
        questoes[9].pergunta = "O que significa a sigla BCAA na suplementação?";
        questoes[9].opcaoA = "Basic Carbohydrate and Amino Acids";
        questoes[9].opcaoB = "Branched-Chain Amino Acids (Aminoácidos de Cadeia Ramificada)";
        questoes[9].opcaoC = "Best Calcium and Acid Agent";
        questoes[9].opcaoD = "Bodybuilding Control And Action";
        questoes[9].opcaoE = "Biological Compound Active Asset";
        questoes[9].correta = "B";

        // Questão 11
        questoes[10] = new Questao();
        questoes[10].pergunta = "Qual a principal vantagem de incluir fibras alimentares na dieta?";
        questoes[10].opcaoA = "Garantir o funcionamento adequado do trânsito intestinal e saciedade";
        questoes[10].opcaoB = "Aumentar instantaneamente a carga no supino";
        questoes[10].opcaoC = "Substituir completamente a necessidade de beber água";
        questoes[10].opcaoD = "Eliminar a necessidade de descanso muscular";
        questoes[10].opcaoE = "Causar picos rápidos de insulina";
        questoes[10].correta = "A";

        // Questão 12
        questoes[11] = new Questao();
        questoes[11].pergunta = "Qual é o objetivo principal do período de 'Cutting' na musculação?";
        questoes[11].opcaoA = "Ganhar o máximo de volume muscular possível";
        questoes[11].opcaoB = "Aumentar a força máxima em 100%";
        questoes[11].opcaoC = "Reduzir o percentual de gordura corporal mantendo a massa magra";
        questoes[11].opcaoD = "Recuperar lesões articulares graves";
        questoes[11].opcaoE = "Aumentar a retenção de líquidos intracelulares";
        questoes[11].correta = "C";

        // Questão 13
        questoes[12] = new Questao();
        questoes[12].pergunta = "Qual destes equipamentos é utilizado especificamente para Puxada Alta (costas)?";
        questoes[12].opcaoA = "Barra fixa ou polia alta";
        questoes[12].opcaoB = "Halteres leves para elevação lateral";
        questoes[12].opcaoC = "Cadeira abdominal";
        questoes[12].opcaoD = "Mesa flexora";
        questoes[12].opcaoE = "Barra W para rosca direta";
        questoes[12].correta = "A";

        // Questão 14
        questoes[13] = new Questao();
        questoes[13].pergunta = "Por que a hidratação adequada é crucial para o rendimento na academia?";
        questoes[13].opcaoA = "A desidratação reduz o volume sanguíneo e a força de contração muscular";
        questoes[13].opcaoB = "A água pura queima calorias diretamente ao entrar no estômago";
        questoes[13].opcaoC = "A água substitui o uso de suplementos de proteína";
        questoes[13].opcaoD = "Beber água impede totalmente a fadiga mental";
        questoes[13].opcaoE = "A água serve apenas para lubrificar as articulações dos dedos";
        questoes[13].correta = "A";

        // Questão 15
        questoes[14] = new Questao();
        questoes[14].pergunta = "Qual o papel do descanso (sono e dias off) no processo de hipertrofia?";
        questoes[14].opcaoA = "O músculo cresce e se recupera estruturalmente durante o descanso";
        questoes[14].opcaoB = "O descanso serve apenas para evitar o tédio de ir à academia";
        questoes[14].opcaoC = "Dormir bem reduz o gasto calórico a zero";
        questoes[14].opcaoD = "O descanso elimina a necessidade de comer proteínas";
        questoes[14].opcaoE = "Treinar todos os dias sem folga é a única forma de crescer";
        questoes[14].correta = "A";

        // Execução do Quiz
        int acertos = 0;
        for (int i = 0; i < questoes.length; i++) {
            System.out.println("\nQuestão " + (i + 1) + ": " + questoes[i].pergunta);
            System.out.println("A) " + questoes[i].opcaoA);
            System.out.println("B) " + questoes[i].opcaoB);
            System.out.println("C) " + questoes[i].opcaoC);
            System.out.println("D) " + questoes[i].opcaoD);
            System.out.println("E) " + questoes[i].opcaoE);
            System.out.print("Digite a sua alternativa (A, B, C, D ou E): ");

            String resposta = scanner.nextLine().trim();

            // Utilizando o método isCorreta da classe Questao do professor
            if (questoes[i].isCorreta(resposta)) {
                acertos++;
            }
        }

        // Cálculo da média com 2 casas decimais e exibição final
        double mediaAcerto = ((double) acertos / questoes.length) * 100;

        System.out.println("\n==================================================");
        System.out.println("                   RESULTADO FINAL                ");
        System.out.println("==================================================");
        System.out.println(" Total de Questões: " + questoes.length);
        System.out.println(" Questões que você acertou: " + acertos);
        System.out.printf(" Média de acerto: %.2f%%\n", mediaAcerto);
        System.out.println("==================================================");
        System.out.println(" Mensagem: Obrigado por participar do Quiz! Bons treinos!");
        System.out.println("==================================================");

        scanner.close();
    }
}
