import java.util.Scanner;
//Exercicio 08: Faça um Programa que pergunte quanto você ganha por hora 
//e o número de horas trabalhadas no mês. Calcule e mostre o total do
//seu salário no referido mês.
class Main {
  
  public static void main(String[] args) {
  //Declaração de variáveis
  double valorHora;
  double horasTrabalhadas;
  double valorTotal;

  //Passo 1: fazer a entrada dos dados
    Scanner teclado = new Scanner(System.in);
    System.out.println ("Quanto voce recebe por hora? ");
    valorHora = teclado.nextDouble();
    System.out.println ("Quantas horas voce trabalha no mes? ");
    horasTrabalhadas = teclado.nextDouble();

  //Passo 2: Fazer o calculo
    valorTotal = valorHora * horasTrabalhadas;

  //Passo 3: exibir a resposta pro usuário
    System.out.println("Seu salario total será de: R$" + valorTotal);
  }
  
}