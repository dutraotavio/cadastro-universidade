import java.util.Scanner;

public class Aluno {

          Scanner sc = new Scanner(System.in);

          private String nome;
          private String numeroMatricula;

          public String getNome() {
                    return nome = sc.nextLine();
          }

          public String getNumeroMatricula() {
                    return numeroMatricula = sc.nextLine();
          }

          @Override
          public String toString() {
                    return "Bem Vindo " + this.nome + " - Matrícula: " + this.numeroMatricula;
          }
}
