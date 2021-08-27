import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

          Scanner sc = new Scanner(System.in);
          List<Aluno> alunos = new ArrayList<>();

          public void cadastro() {

                    System.out.println("Selecione uma opção : ");
                    System.out.println("1 - Matrícula");
                    System.out.println("2 - Sair");

                    int opcao = sc.nextInt();
                    int continuar = 0;

                    while (opcao <= 0 || opcao > 2) {
                              System.out.println("*** Entre com uma opção válida ***");
                              System.out.println("1 - Matrícula");
                              System.out.println("2 - Sair");
                              opcao = sc.nextInt();
                    }

                    switch (opcao) {
                              case 1:
                                        Aluno aluno = new Aluno();

                                        System.out.println("Entre com seu nome: ");
                                        aluno.getNome();
                                        System.out.println("Entre com o número de matrícula: ");
                                        aluno.getNumeroMatricula();

                                        alunos.add(aluno);

                                        // melhorar essa código para rematricula
                                        System.out.println("Digite 9 para matricular outro aluno ou 5 para encerrar.");
                                        continuar = sc.nextInt();

                                        if (continuar == 9) {
                                                  cadastro();
                                        } else {
                                                  System.out.println("Encerrando...");
                                        }

                                        break;
                              case 2:
                                        System.out.println("Saindo...");
                                        break;
                    }

          }

          public void mostraCadastros() {
                    System.out.println(alunos);
                    System.out.println(alunos.size());
          }

}
