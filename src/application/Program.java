package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		Account acc;
		
		System.out.println("Entre com os dados da conta");
		System.out.print("Número: ");
		int numero = read.nextInt();
		System.out.print("Nome: ");
		String nome = read.nextLine();
		System.out.print("Saldo Inicial: ");
		double saldoInicial = read.nextDouble();
		System.out.print("Limite do saque: ");
		double limiteSaque = read.nextDouble();
		
		acc = new Account(numero, nome, saldoInicial, limiteSaque);
		
		System.out.println("Qual valor do saque?");
		acc.saque(read.nextDouble());
		
		System.out.println(acc);
		
		read.close();
	}

}
