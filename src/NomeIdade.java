

/*Faça um programa que leia conjuntos de dois valores, o primeiro representando o
nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)*/

import java.util.Scanner;

public class NomeIdade {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String nome;
         int idade;
        do{
            System.out.println("Digite o Nome");
            nome = scanner.next();
            System.out.println("Digite a idade");
            idade = scanner.nextInt();
        }while(!nome.equals("0"));
        System.out.println("Nome: " + nome + "Idade: "+ idade);
    }
}
