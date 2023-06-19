// Alunos: Ariane Cristine, Arthur vinícius, Gabriel Henrique e Yuri Catunda

import java.util.Scanner;

public class entregafinal {

        public static void main(String[] args) {
            Scanner dado = new Scanner(System.in);
            double[] medias = new double[20]; // array para determinar o intervalo do loop (20 estudantes)
            int opcao; // variavel do menu
    
            // "Faça" Menu de opções
            do {
                System.out.println("Menu:");
                System.out.println("1) Cadastrar as médias dos estudantes");
                System.out.println("2) Apresentar o número de estudantes com conceitos A e B");
                System.out.println("3) Apresentar o número de estudantes com conceitos C e D");
                System.out.println("4) Apresentar o número de estudantes com conceito abaixo de D");
                System.out.println("5) Apresentar o número de estudantes com conceito acima de B");
                System.out.println("6) Sair do programa");
                System.out.print("Escolha uma opção (1-6): ");
                opcao = dado.nextInt();

                // Opções:
                switch (opcao) {
                    case 1:
                        cadastrarMedias(dado, medias);
                        break;
                    case 2:
                        contarEstudantesConceitoAeB(medias);
                        break;
                    case 3:
                        contarEstudantesConceitoCeD(medias);
                        break;
                    case 4:
                        contarEstudantesConceitoAbaixoDeD(medias);
                        break;
                    case 5:
                        contarEstudantesConceitoAcimaDeB(medias);
                        break;
                    case 6:
                        System.out.println(" Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Digite um número entre as opções (1-6).");
                }
                System.out.println();
            } while (opcao != 6); // enquanto a opções escolhida seja diferente de 6, faça o menu de opções
    
            dado.close();
        }

        // Função para cadastramento das médias dos 20 estudantes
        public static void cadastrarMedias(Scanner dado, double[] medias) {
            for (int i = 0; i < medias.length; i++) { // para i (contador) começando do 0 e sendo menor que a quantidade de medias (declarada no array do início), aumente uma unidade de i à cada estudante
               
                // Ordem do estudante
                System.out.println("Estudante " + (i + 1)); // (i + 1 para que à cada estudante, aumente sucessivamente seus respectivos números)
                
                // Identificação do estudante
                System.out.print("Número de identificação: ");
                dado.nextInt();

                // Leitura das notas
                System.out.print("Nota 1 (Em caso de notas com valor decimal, favor usar vírgula):\n");
                double nota1 = lerNota(dado);
                System.out.print("Nota 2 (Em caso de notas com valor decimal, favor usar vírgula):\n");
                double nota2 = lerNota(dado);
                System.out.print("Nota 3 (Em caso de notas com valor decimal, favor usar vírgula):\n");
                double nota3 = lerNota(dado);

                // Leitura da Média dos Exercícios
                double mediaExercicios = calcularMediaExercícios(nota1, nota2, nota3);
                System.out.println("Média dos exercícios do Estudante " + (i + 1) + ":\n"+ mediaExercicios);

                // Leitura da Média de Aproveitamento
                double mediaAproveitamento = calcularMediaAproveitamento(nota1, nota2, nota3, mediaExercicios);
                medias[i] = mediaAproveitamento;
                System.out.println("Média de aproveitamento do Estudante "+ (i + 1) + ":\n" + mediaAproveitamento);
                System.out.println();
            }
        }

        // Função para determinar que seja aceito apenas notas entre 0 e 10
        public static double lerNota(Scanner dado) {
            double nota;
            do {
                nota = dado.nextDouble();
                if (nota < 0.0 || nota > 10.0) {
                    System.out.print("Nota inválida. Digite novamente um valor entre 0.0 e 10.0: ");
                }
            } while (nota < 0.0 || nota > 10.0);
            return nota;
        }

        // Função para cálculo da Média dos exercícios
        public static double calcularMediaExercícios(double nota1, double nota2, double nota3){
            return (nota1 + nota2 + nota3) / 3;
        }

        // Função para cálculo da Média de Aproveitamento
        public static double calcularMediaAproveitamento(double nota1, double nota2, double nota3, double mediaExercicios) {
            return (nota1 + 2 * nota2 + 3 * nota3 + mediaExercicios) / 7;
        }

        // Função para contabilizar o número de estudantes com Conceitos A e B
        public static void contarEstudantesConceitoAeB(double[] medias) {
            int contador = 0;
            for (double media : medias) { // For-Each loop percorrendo o array "media" e a cada iteração, atribui o valor do elemento atual a variável media
                if (media >= 9.0 && media <= 10.0 || media >= 7.5 && media <= 9.0) { 
                    contador++;
                }
            }
            System.out.println("Número de estudantes com conceitos A e B: " + contador + " estudantes");
        }

        // Função para contabilizar o número de estudantes com Conceito C e D
        public static void contarEstudantesConceitoCeD(double[] medias) {
            int contador = 0;
            for (double media : medias) {  // For-Each loop percorrendo o array "media" e a cada iteração, atribui o valor do elemento atual a variável media
                if (media >= 6.0 && media < 9.0 || media >= 4.0 && media <= 6.0) {
                    contador++;
                }
            }
            System.out.println("Número de estudantes com conceitos C e D: " + contador + " estudantes");
        }

        // Função para contabilizar o número de estudantes com Conceito abaixo de D
        public static void contarEstudantesConceitoAbaixoDeD(double[] medias) {
            int contador = 0;
            for (double media : medias) {  // For-Each loop percorrendo o array "media" e a cada iteração, atribui o valor do elemento atual a variável media
                if (media < 4.0) {
                    contador++;
                }
            }
            System.out.println("Número de estudantes com conceito abaixo de D: " + contador + " estudantes");
        }

        // Função para contabilizar o número de estudantes com Conceito Acima de B
        public static void contarEstudantesConceitoAcimaDeB(double[] medias) {
            int contador = 0;
            for (double media : medias) {  // For-Each loop percorrendo o array "media" e a cada iteração, atribui o valor do elemento atual a variável media
                if (media > 9.0) {
                    contador++;
                }
            }
            System.out.println("Número de estudantes com conceito acima de B: " + contador + " estudantes");
        }
}
    