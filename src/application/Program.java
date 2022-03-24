package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.execptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		Account acc;
		
		try {
			System.out.println("Entre com os dados da conta");
			System.out.print("Número: ");
			int numero = read.nextInt();
			System.out.print("Nome: ");
			read.nextLine();
			String nome = read.nextLine();
			System.out.print("Saldo Inicial: ");
			double saldoInicial = read.nextDouble();
			System.out.print("Limite do saque: ");
			double limiteSaque = read.nextDouble();
			
			acc = new Account(numero, nome, saldoInicial, limiteSaque);
			
			System.out.println("Qual valor do saque?");
			acc.saque(read.nextDouble());
			
			System.out.println(acc);
		}
		catch(InputMismatchException e) {
			System.out.println("Valor digitado errado!");
		}
		catch(DomainExceptions e) {
			System.out.println(e.getMessage());
		}
		read.close();
	}

}
