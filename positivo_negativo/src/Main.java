/* Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo",
caso contrário, exiba "Número negativo". */

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Bem vindo ao programa que identifica se o número é positivo ou negativo.");
        double numero;
        System.out.println("Digite um número: ");
        numero = leitura.nextDouble();
        if(numero > 0)
        {
            System.out.println("O número é positivo.");
        }
        else if(numero == 0)
        {
            System.out.println("O número é neutro.");
        }
        else
        {
            System.out.println("O número é negativo");
        }

    }
}